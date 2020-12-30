package com.example.bestelapp.data.qr

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "qr_table")
data class Qr(
    @PrimaryKey(autoGenerate = true)
    var qrId: Long = 0L,

    @ColumnInfo(name = "table_number")
    var tableNumber: Int = -1,

    @ColumnInfo(name = "control_number")
    var controlNumber: Int = -1
) {
    constructor(
        _tableNumber: Int,
        _controlNumber: Int
    ) :
        this(
            tableNumber = _tableNumber,
            controlNumber = _controlNumber
        )
}
