package com.example.group11_comp304sec005_lab03

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(AirLineData::class), version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun airLineDao(): AirlineScheduleDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "app_database"
                )
                    .createFromAsset("FLightsDatabase.db")
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }
}