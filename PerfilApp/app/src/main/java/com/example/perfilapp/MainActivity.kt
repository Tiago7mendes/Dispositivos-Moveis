package com.example.perfilapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val btnDayNight = findViewById<Button>(R.id.btnDayNight)
        val btnIdioma = findViewById<Button>(R.id.btnIdioma)
        val btnAlterar = findViewById<Button>(R.id.btnAlterar)
        val etNome = findViewById<EditText>(R.id.etNome)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val tvNome = findViewById<TextView>(R.id.tvNome)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        
        btnDayNight.setOnClickListener {
            val isNight = AppCompatDelegate.getDefaultNightMode() ==
            AppCompatDelegate.MODE_NIGHT_YES
            
            val mode = if (isNight) {
                AppCompatDelegate.MODE_NIGHT_NO
            } else {
                AppCompatDelegate.MODE_NIGHT_YES
            }
            
            AppCompatDelegate.setDefaultNightMode(mode)
        }
        
        btnIdioma.setOnClickListener {
            val idiomaAtual = AppCompatDelegate.getApplicationLocales()
            val usandoIdiomaPadrao =
            !idiomaAtual.isEmpty && idiomaAtual[0]?.language == "en"
            val proximoIdioma = if (usandoIdiomaPadrao) "pt" else "en"
            AppCompatDelegate.setApplicationLocales(
            LocaleListCompat.forLanguageTags(proximoIdioma)
            )
        }
        
        btnAlterar.setOnClickListener {
            tvNome.text = etNome.text.toString()
            tvEmail.text = etEmail.text.toString()
        }
    }
}