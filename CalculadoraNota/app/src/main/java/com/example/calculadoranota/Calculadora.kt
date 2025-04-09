package com.example.calculadoranota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color

class Calculadora : AppCompatActivity() {
    lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        button1 = findViewById(R.id.button3)
        button1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val editTextNota1 = findViewById<EditText>(R.id.editTextNumberDecimal)
        val editTextNota2 = findViewById<EditText>(R.id.editTextNumberDecimal2)
        val editTextNota3 = findViewById<EditText>(R.id.editTextNumberDecimal3)
        val editTextNota4 = findViewById<EditText>(R.id.editTextNumberDecimal4)
        val buttonCalcular = findViewById<Button>(R.id.button2)
        val textViewResultado = findViewById<TextView>(R.id.resultado)
        val textViewNota = findViewById<TextView>(R.id.nota)

        buttonCalcular.setOnClickListener {

            val nota1 = editTextNota1.text.toString().toDoubleOrNull()
            val nota2 = editTextNota2.text.toString().toDoubleOrNull()
            val nota3 = editTextNota3.text.toString().toDoubleOrNull()
            val nota4 = editTextNota4.text.toString().toDoubleOrNull()

            if (nota1 != null && nota2 != null && nota3 != null && nota4 != null) {

                val media = (nota1 + nota2 + nota3 + nota4) / 4

                textViewNota.text = "Média: %.2f".format(media)

                val resultado = when {
                    media < 4 -> "Reprovado"
                    media >= 4 && media < 6 -> "Prova Sub"
                    else -> "Aprovado"
                }

                textViewResultado.text = "Status: $resultado"

                val cor = when (resultado) {
                    "Aprovado" -> Color.GREEN
                    "Prova Sub" -> Color.rgb(255, 165, 0)  // Cor laranja
                    else -> Color.RED  // Cor vermelha para "Reprovado"
                }

                textViewResultado.setTextColor(cor)
            } else {
                textViewNota.text = "Por favor, insira todas as notas."
                textViewResultado.text = ""
            }
        }
    }
}
