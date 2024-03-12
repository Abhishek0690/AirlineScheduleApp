package com.example.group11_comp304sec005_lab03

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [AirLineData::class], version = 1, exportSchema = false)
abstract class AirlineScheduleDatabase : RoomDatabase() {
    abstract fun airlineScheduleDao(): AirlineScheduleDao

    companion object {
        @Volatile
        private var INSTANCE: AirlineScheduleDatabase? = null

        fun getDatabase(context: Context): AirlineScheduleDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AirlineScheduleDatabase::class.java,
                    "airline_schedule_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
