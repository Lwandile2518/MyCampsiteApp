package com.example.myapplication

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class DetailedViewScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen)

        // The layout activity_detailed_view_screen.xml has these IDs:
        // tvTitle, edtItemName, edtCategory, edtQuantity, edtComments, btnSave, btnbacktobase
        
        findViewById<Button>(R.id.btnbacktobase).setOnClickListener { 
            finish() 
        }

        findViewById<Button>(R.id.btnSave).setOnClickListener {
            val name = findViewById<EditText>(R.id.edtItemName).text.toString()
            val category = findViewById<EditText>(R.id.edtCategory).text.toString()
            val quantityStr = findViewById<EditText>(R.id.edtQuantity).text.toString()
            val comment = findViewById<EditText>(R.id.edtComments).text.toString()
            
            val quantity = quantityStr.toIntOrNull() ?: 0
            
            if (name.isNotEmpty()) {
                DataManager.addItem(name, category, quantity, comment)
                Toast.makeText(this, "Gear Saved!", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Please enter an item name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}