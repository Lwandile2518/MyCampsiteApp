package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        findViewById<Button>(R.id.btnAddGear).setOnClickListener {
            startActivity(Intent(this, ChecklistScreen::class.java))
        }

        findViewById<Button>(R.id.btnViewGear).setOnClickListener {
            startActivity(Intent(this, DetailedViewScreen::class.java))
        }
    }

    // Refresh total every time we come back to this screen
    override fun onResume() {
        super.onResume()
        findViewById<TextView>(R.id.tvTotalCount).text =
            DataManager.getTotalItems().toString()
    }
}
