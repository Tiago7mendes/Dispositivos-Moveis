package com.example.perfilapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
    }
    private lateinit var btnDayNight: Button
    private lateinit var btnIdioma: Button
    private lateinit var btnAlterar: Button
    private lateinit var etNome: EditText
    private lateinit var etEmail: EditText
    private lateinit var tvNome: TextView
    private lateinit var tvEmail: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        setupListeners()
    }
    private fun setupViews() {
        btnDayNight = findViewById(R.id.btnDayNight)
        btnIdioma = findViewById(R.id.btnIdioma)
        btnAlterar = findViewById(R.id.btnAlterar)
        etNome = findViewById(R.id.etNome)
        etEmail = findViewById(R.id.etEmail)
        tvNome = findViewById(R.id.tvNome)
        tvEmail = findViewById(R.id.tvEmail)
    }
    private fun setupListeners() {
        btnDayNight.setOnClickListener { mudarTema() }
        btnIdioma.setOnClickListener { alternarIdioma() }
        btnAlterar.setOnClickListener { atualizarTexto() }
    }
    /*
     Versão alternativa, usando referência direta
     private fun setupListeners() {
     btnDayNight.setOnClickListener(::mudarTema)
     btnIdioma.setOnClickListener(::alternarIdioma)
     btnAlterar.setOnClickListener(::atualizarTexto)
     }
    */
    private fun mudarTema() {
        val isNight = AppCompatDelegate.getDefaultNightMode() ==
                AppCompatDelegate.MODE_NIGHT_YES
        val mode = if (isNight) {
            AppCompatDelegate.MODE_NIGHT_NO
        } else {
            AppCompatDelegate.MODE_NIGHT_YES
        }
        AppCompatDelegate.setDefaultNightMode(mode)
    }
    private fun alternarIdioma() {
        val idiomaAtual = AppCompatDelegate.getApplicationLocales()
        val usandoIngles = !idiomaAtual.isEmpty && idiomaAtual[0]?.language == "en"
        val proximoIdioma = if (usandoIngles) "pt" else "en"
        AppCompatDelegate.setApplicationLocales(
            LocaleListCompat.forLanguageTags(proximoIdioma))
    }
    private fun atualizarTexto() {
        tvNome.text = etNome.text.toString()
        tvEmail.text = etEmail.text.toString()
    }
}