package com.zhahira.kalkulatorsederhana

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class kalkulator_sederhana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kalkulator_sederhana)

        val etAngka1 = findViewById<EditText>(R.id.etAngka1)
        val etAngka2 = findViewById<EditText>(R.id.etAngka2)
        val btnTambah = findViewById<Button>(R.id.btnTambah)
        val btnKali = findViewById<Button>(R.id.btnKali)
        val btnKurang = findViewById<Button>(R.id.btnKurang)
        val txtHasil = findViewById<TextView>(R.id.txtHasil)

        fun stringToInt(value: String): Int {
            return value.toIntOrNull() ?: 0
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnTambah.setOnClickListener {
            val Angka1 = stringToInt(etAngka1.text.toString())
            val Angka2 = stringToInt(etAngka2.text.toString())
            val hasil = Angka1 + Angka2
            txtHasil.text="Hasil:$hasil"
        }
        btnKali.setOnClickListener {
            val Angka1 = stringToInt(etAngka1.text.toString())
            val Angka2 = stringToInt(etAngka2.text.toString())
            val hasil = Angka1 * Angka2
            txtHasil.text="Hasil:$hasil"
        }
        btnKurang.setOnClickListener {
             val Angka1 = stringToInt(etAngka1.text.toString())
             val Angka2 = stringToInt(etAngka2.text.toString())
             val hasil = Angka1 - Angka2
        txtHasil.text="Hasil:$hasil"
        }

    }
}