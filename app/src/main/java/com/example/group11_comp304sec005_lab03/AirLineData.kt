package com.example.group11_comp304sec005_lab03

import androidx.room.Entity

@Entity (tableName = "airline_schedule")
data class AirLineData(
var flightNumber: Int = 0,
var terminalNumber: String? = null,
var airLineName: String? = null,
var arrivalTime: String? = null,
var status: String? = null
) {
    override fun toString(): String {
        return "AirLineData(flightNumber=$flightNumber, terminalNumber=$terminalNumber, airLineName=$airLineName, arrivalTime=$arrivalTime, status=$status)"
    }
}