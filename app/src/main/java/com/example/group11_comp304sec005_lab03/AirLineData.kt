package com.example.group11_comp304sec005_lab03

import androidx.room.ColumnInfo
import androidx.room.Entity
import java.util.jar.Attributes

@Entity (tableName = "airline_schedule")
data class AirLineData(
    @ColumnInfo(name = "flightNumber" ) var flightNumber: Int ,
    @ColumnInfo(name = "terminalNumber" )var terminalNumber: String,
    @ColumnInfo(name = "airLineName" )var airLineName: String,
    @ColumnInfo(name = "arrivalTime" ) var arrivalTime: String,
    @ColumnInfo(name = "Status" )var status: String
)

