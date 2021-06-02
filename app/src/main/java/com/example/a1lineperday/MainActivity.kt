package com.example.a1lineperday

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    private val task: ArrayList<String>? = null
    private val time: ArrayList<Date>? = null
    private val location: ArrayList<String>? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById(R.id.action_Add_Task) as Button
        // set on-click listener
        btnStart.setOnClickListener{

            Toast.makeText(this@MainActivity, "Task Created.", Toast.LENGTH_SHORT).show()
        }

    }

    //Solve tommorow make this add a task
    fun onAddItem(v: View?) {
        val etNewItem = findViewById<View>(R.id.etNewItem) as EditText
        val itemText = etNewItem.text.toString()
        itemsAdapter.add(itemText)
        etNewItem.setText("")
    }


}