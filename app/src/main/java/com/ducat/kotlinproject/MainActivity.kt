package com.ducat.kotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText = findViewById<EditText>(R.id.editTextText)
        var  button = findViewById<Button>(R.id.button)

        button.setOnClickListener {

            var intent = Intent(this, Second :: class.java)
            startActivity(intent)

        }

    }
}