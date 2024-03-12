package com.example.group11_comp304sec005_lab03

import androidx.room.*

@Dao
interface AirlineScheduleDao {
    @Insert
    suspend fun insert(airlineSchedule: AirLineData)

    @Update
    suspend fun update(airlineSchedule: AirLineData)

    @Delete
    suspend fun delete(airlineSchedule: AirLineData)

    @Query("SELECT * FROM airline_schedule")
    suspend fun getAllAirlineSchedules(): List<AirLineData>

    @Query("SELECT * FROM airline_schedule WHERE airLineName = :airlineName order by arrivalTime ASC")
    suspend fun getAirlineSchedulesByAirlineName(airlineName: String): List<AirLineData>
    // Add more queries as needed
}