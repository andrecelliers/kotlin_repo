package com.example.semesterproject

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var greetingTextView: TextView
    private lateinit var forecastTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingTextView = findViewById(R.id.activity_main_greeting_text_view)
        greetingTextView.setTextColor(getColor(R.color.black))

        forecastTextView = findViewById(R.id.activity_main_greeting_text_view_3)
        forecastTextView.text = "It is going to be hot out there"
        forecastTextView.setTextColor(Color.parseColor("#f51120"))
    }
}