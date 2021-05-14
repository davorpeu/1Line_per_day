package com.example.a1lineperday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById(R.id.Start_Btn) as Button
        // set on-click listener
        btnStart.setOnClickListener{
            Toast.makeText(this@MainActivity, "You clicked me ye.", Toast.LENGTH_SHORT).show()
        }
    }
}