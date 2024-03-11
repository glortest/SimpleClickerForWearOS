package com.example.myapplication.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

    private lateinit var countTextView: TextView
    private lateinit var plusButton: Button
    private lateinit var resetButton: Button
    private lateinit var minusButton: Button
    private lateinit var plus10Button: Button

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTextView = findViewById(R.id.count)
        plusButton = findViewById(R.id.plus)
        plus10Button = findViewById(R.id.plus10)
        minusButton = findViewById(R.id.minus)
        resetButton = findViewById(R.id.back)

        plusButton.setOnClickListener {
            count++
            countTextView.text = count.toString()
        }
        minusButton.setOnClickListener {
            count -= 1
            countTextView.text = count.toString()
        }

        plus10Button.setOnClickListener {
            count += 10
            countTextView.text = count.toString()
        }

        resetButton.setOnClickListener {
            count = 0
            countTextView.text = count.toString()
        }
    }
}