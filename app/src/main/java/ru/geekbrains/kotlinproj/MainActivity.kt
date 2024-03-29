package ru.geekbrains.kotlinproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener { viewButton ->
            (viewButton as Button).text = "PRESSED"
        }
    }
    
    override fun onRun() {
        super.onRun();
    }
}
