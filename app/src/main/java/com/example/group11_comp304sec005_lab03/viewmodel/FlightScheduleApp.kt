package com.example.group11_comp304sec005_lab03.viewmodel

import android.app.Application
import com.example.group11_comp304sec005_lab03.AppDatabase

class FlightScheduleApp: Application(){
    val database by lazy { AppDatabase.getDatabase(this) }
}