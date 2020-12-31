package com.example.bestelapp.data.qr;

import java.lang.System;

/**
 * An entity data class to represent a Qr code
 *
 * @property qrId The id of the Qr code
 * @property tableNumber The number of the table
 * @property controlNumber The controlcode corresponding to the tablenumber
 * @constructor Creates a [Qr].
 * @author Cedric Delaruelle
 */
@androidx.room.Entity(tableName = "qr_table")
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005B#\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/example/bestelapp/data/qr/Qr;", "", "_tableNumber", "", "_controlNumber", "(II)V", "qrId", "", "tableNumber", "controlNumber", "(JII)V", "getControlNumber", "()I", "setControlNumber", "(I)V", "getQrId", "()J", "setQrId", "(J)V", "getTableNumber", "setTableNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Qr {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long qrId;
    @androidx.room.ColumnInfo(name = "table_number")
    private int tableNumber;
    @androidx.room.ColumnInfo(name = "control_number")
    private int controlNumber;
    
    public final long getQrId() {
        return 0L;
    }
    
    public final void setQrId(long p0) {
    }
    
    public final int getTableNumber() {
        return 0;
    }
    
    public final void setTableNumber(int p0) {
    }
    
    public final int getControlNumber() {
        return 0;
    }
    
    public final void setControlNumber(int p0) {
    }
    
    public Qr(long qrId, int tableNumber, int controlNumber) {
        super();
    }
    
    public Qr() {
        super();
    }
    
    public Qr(int _tableNumber, int _controlNumber) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    /**
     * An entity data class to represent a Qr code
     *
     * @property qrId The id of the Qr code
     * @property tableNumber The number of the table
     * @property controlNumber The controlcode corresponding to the tablenumber
     * @constructor Creates a [Qr].
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.bestelapp.data.qr.Qr copy(long qrId, int tableNumber, int controlNumber) {
        return null;
    }
    
    /**
     * An entity data class to represent a Qr code
     *
     * @property qrId The id of the Qr code
     * @property tableNumber The number of the table
     * @property controlNumber The controlcode corresponding to the tablenumber
     * @constructor Creates a [Qr].
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * An entity data class to represent a Qr code
     *
     * @property qrId The id of the Qr code
     * @property tableNumber The number of the table
     * @property controlNumber The controlcode corresponding to the tablenumber
     * @constructor Creates a [Qr].
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * An entity data class to represent a Qr code
     *
     * @property qrId The id of the Qr code
     * @property tableNumber The number of the table
     * @property controlNumber The controlcode corresponding to the tablenumber
     * @constructor Creates a [Qr].
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}