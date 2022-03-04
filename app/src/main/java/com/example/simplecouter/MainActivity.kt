package com.example.simplecouter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var countTxt: TextView
    private lateinit var decreBtn: Button
    private lateinit var ResetBtn: Button
    private lateinit var increBtn: Button

    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTxt = findViewById(R.id.countTxt)
        decreBtn = findViewById(R.id.decreBtn)
        ResetBtn = findViewById(R.id.ResetBtn)
        increBtn = findViewById(R.id.increBtn)

        decreBtn.setOnClickListener(clickListener)
        ResetBtn.setOnClickListener(clickListener)
        increBtn.setOnClickListener(clickListener)
    }

    private val clickListener = View.OnClickListener { view ->
        when (view.id) {
            R.id.increBtn -> increment()

            R.id.decreBtn -> decrement()

            R.id.ResetBtn ->   reset()
        }
    }

    private fun increment() {
        count += 1
        countTxt.text = count.toString()
    }

    private fun decrement() {
        count -= 1
        countTxt.text = count.toString()
    }

    private fun reset() {
        count = 0
        countTxt.text = count.toString()
    }
}