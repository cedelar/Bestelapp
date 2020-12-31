package com.example.bestelapp.data.qr

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * An entity data class to represent a Qr code
 *
 * @property qrId The id of the Qr code
 * @property tableNumber The number of the table
 * @property controlNumber The controlcode corresponding to the tablenumber
 * @constructor Creates a [Qr].
 * @author Cedric Delaruelle
 */
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
