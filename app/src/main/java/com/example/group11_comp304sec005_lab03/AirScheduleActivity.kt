package com.example.group11_comp304sec005_lab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class AirScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_air_schedule)
        val RecyclerView = findViewById<RecyclerView>(R.id.recyclerView)

    }
}