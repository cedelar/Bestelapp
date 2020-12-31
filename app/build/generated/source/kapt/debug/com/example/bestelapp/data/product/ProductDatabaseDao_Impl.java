package com.example.bestelapp.data.product;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDatabaseDao_Impl implements ProductDatabaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DatabaseProduct> __insertionAdapterOfDatabaseProduct;

  private final EntityInsertionAdapter<DatabaseProduct> __insertionAdapterOfDatabaseProduct_1;

  private final EntityDeletionOrUpdateAdapter<DatabaseProduct> __updateAdapterOfDatabaseProduct;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public ProductDatabaseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDatabaseProduct = new EntityInsertionAdapter<DatabaseProduct>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `product_table` (`product_id`,`product_name`,`product_price`,`product_description`,`product_picturelink`,`product_category`,`product_availability`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DatabaseProduct value) {
        stmt.bindLong(1, value.getProductId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindDouble(3, value.getPrice());
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getPictureLink() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPictureLink());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCategory());
        }
        final int _tmp;
        _tmp = value.getAvailable() ? 1 : 0;
        stmt.bindLong(7, _tmp);
      }
    };
    this.__insertionAdapterOfDatabaseProduct_1 = new EntityInsertionAdapter<DatabaseProduct>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `product_table` (`product_id`,`product_name`,`product_price`,`product_description`,`product_picturelink`,`product_category`,`product_availability`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DatabaseProduct value) {
        stmt.bindLong(1, value.getProductId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindDouble(3, value.getPrice());
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getPictureLink() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPictureLink());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCategory());
        }
        final int _tmp;
        _tmp = value.getAvailable() ? 1 : 0;
        stmt.bindLong(7, _tmp);
      }
    };
    this.__updateAdapterOfDatabaseProduct = new EntityDeletionOrUpdateAdapter<DatabaseProduct>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `product_table` SET `product_id` = ?,`product_name` = ?,`product_price` = ?,`product_description` = ?,`product_picturelink` = ?,`product_category` = ?,`product_availability` = ? WHERE `product_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DatabaseProduct value) {
        stmt.bindLong(1, value.getProductId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindDouble(3, value.getPrice());
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getPictureLink() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPictureLink());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCategory());
        }
        final int _tmp;
        _tmp = value.getAvailable() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        stmt.bindLong(8, value.getProductId());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM product_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(final DatabaseProduct databaseProduct) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDatabaseProduct.insert(databaseProduct);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final DatabaseProduct... databaseProducts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDatabaseProduct_1.insert(databaseProducts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final DatabaseProduct databaseProduct) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfDatabaseProduct.handle(databaseProduct);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clear() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClear.release(_stmt);
    }
  }

  @Override
  public DatabaseProduct get(final long key) {
    final String _sql = "SELECT * from product_table WHERE product_Id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, key);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "product_price");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "product_description");
      final int _cursorIndexOfPictureLink = CursorUtil.getColumnIndexOrThrow(_cursor, "product_picturelink");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "product_category");
      final int _cursorIndexOfAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "product_availability");
      final DatabaseProduct _result;
      if(_cursor.moveToFirst()) {
        final long _tmpProductId;
        _tmpProductId = _cursor.getLong(_cursorIndexOfProductId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final double _tmpPrice;
        _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpPictureLink;
        _tmpPictureLink = _cursor.getString(_cursorIndexOfPictureLink);
        final String _tmpCategory;
        _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        final boolean _tmpAvailable;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfAvailable);
        _tmpAvailable = _tmp != 0;
        _result = new DatabaseProduct(_tmpProductId,_tmpName,_tmpPrice,_tmpDescription,_tmpPictureLink,_tmpCategory,_tmpAvailable);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<DatabaseProduct>> getAllProducts() {
    final String _sql = "SELECT * FROM product_table ORDER BY product_category";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"product_table"}, false, new Callable<List<DatabaseProduct>>() {
      @Override
      public List<DatabaseProduct> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "product_price");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "product_description");
          final int _cursorIndexOfPictureLink = CursorUtil.getColumnIndexOrThrow(_cursor, "product_picturelink");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "product_category");
          final int _cursorIndexOfAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "product_availability");
          final List<DatabaseProduct> _result = new ArrayList<DatabaseProduct>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DatabaseProduct _item;
            final long _tmpProductId;
            _tmpProductId = _cursor.getLong(_cursorIndexOfProductId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpPictureLink;
            _tmpPictureLink = _cursor.getString(_cursorIndexOfPictureLink);
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final boolean _tmpAvailable;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAvailable);
            _tmpAvailable = _tmp != 0;
            _item = new DatabaseProduct(_tmpProductId,_tmpName,_tmpPrice,_tmpDescription,_tmpPictureLink,_tmpCategory,_tmpAvailable);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
