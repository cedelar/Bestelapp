package com.example.bestelapp.data.qr;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QrDatabaseDao_Impl implements QrDatabaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Qr> __insertionAdapterOfQr;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public QrDatabaseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQr = new EntityInsertionAdapter<Qr>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `qr_table` (`qrId`,`table_number`,`control_number`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Qr value) {
        stmt.bindLong(1, value.getQrId());
        stmt.bindLong(2, value.getTableNumber());
        stmt.bindLong(3, value.getControlNumber());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM qr_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Qr qr) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfQr.insert(qr);
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
  public LiveData<Qr> getQr() {
    final String _sql = "SELECT * FROM qr_table LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"qr_table"}, false, new Callable<Qr>() {
      @Override
      public Qr call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfQrId = CursorUtil.getColumnIndexOrThrow(_cursor, "qrId");
          final int _cursorIndexOfTableNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "table_number");
          final int _cursorIndexOfControlNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "control_number");
          final Qr _result;
          if(_cursor.moveToFirst()) {
            final long _tmpQrId;
            _tmpQrId = _cursor.getLong(_cursorIndexOfQrId);
            final int _tmpTableNumber;
            _tmpTableNumber = _cursor.getInt(_cursorIndexOfTableNumber);
            final int _tmpControlNumber;
            _tmpControlNumber = _cursor.getInt(_cursorIndexOfControlNumber);
            _result = new Qr(_tmpQrId,_tmpTableNumber,_tmpControlNumber);
          } else {
            _result = null;
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

  @Override
  public LiveData<Integer> getQrCount() {
    final String _sql = "SELECT COUNT(*) FROM qr_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"qr_table"}, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
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
