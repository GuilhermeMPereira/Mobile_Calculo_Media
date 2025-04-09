package com.example.calculadoranota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(
                this,
                Calculadora::class.java
            )
            startActivity(intent)
        }

        button2 = findViewById(R.id.button4)
        button2.setOnClickListener{
            val intent = Intent(
                this,
                Integrantes::class.java
            )
            startActivity(intent)

        }




    }
}