package com.example.calculadoranota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Integrantes : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var button3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_integrantes)


        button = findViewById(R.id.button5)
        button.setOnClickListener {
            val intent = Intent(
                this,
                Integrante2::class.java
            )
            startActivity(intent)
        }

        button2 = findViewById(R.id.voltar)
        button2.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)


        }


    }
}