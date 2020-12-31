package com.example.bestelapp.data.product;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDatabase_Impl extends ProductDatabase {
  private volatile ProductDatabaseDao _productDatabaseDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(4) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `product_table` (`product_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `product_name` TEXT NOT NULL, `product_price` REAL NOT NULL, `product_description` TEXT NOT NULL, `product_picturelink` TEXT NOT NULL, `product_category` TEXT NOT NULL, `product_availability` INTEGER NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_product_table_product_name` ON `product_table` (`product_name`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9902932fcdc61b7ed28a7f18e3ae88cf')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `product_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsProductTable = new HashMap<String, TableInfo.Column>(7);
        _columnsProductTable.put("product_id", new TableInfo.Column("product_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductTable.put("product_name", new TableInfo.Column("product_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductTable.put("product_price", new TableInfo.Column("product_price", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductTable.put("product_description", new TableInfo.Column("product_description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductTable.put("product_picturelink", new TableInfo.Column("product_picturelink", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductTable.put("product_category", new TableInfo.Column("product_category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductTable.put("product_availability", new TableInfo.Column("product_availability", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProductTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProductTable = new HashSet<TableInfo.Index>(1);
        _indicesProductTable.add(new TableInfo.Index("index_product_table_product_name", true, Arrays.asList("product_name")));
        final TableInfo _infoProductTable = new TableInfo("product_table", _columnsProductTable, _foreignKeysProductTable, _indicesProductTable);
        final TableInfo _existingProductTable = TableInfo.read(_db, "product_table");
        if (! _infoProductTable.equals(_existingProductTable)) {
          return new RoomOpenHelper.ValidationResult(false, "product_table(com.example.bestelapp.data.product.DatabaseProduct).\n"
                  + " Expected:\n" + _infoProductTable + "\n"
                  + " Found:\n" + _existingProductTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "9902932fcdc61b7ed28a7f18e3ae88cf", "38caf678d0df2f3bf4e801ecc6680433");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "product_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `product_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ProductDatabaseDao getProductDatabaseDao() {
    if (_productDatabaseDao != null) {
      return _productDatabaseDao;
    } else {
      synchronized(this) {
        if(_productDatabaseDao == null) {
          _productDatabaseDao = new ProductDatabaseDao_Impl(this);
        }
        return _productDatabaseDao;
      }
    }
  }
}
