package com.example.perfilapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import com.example.perfilapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListeners()
    }
    private fun setupListeners() {
        binding.btnDayNight.setOnClickListener { mudarTema() }
        binding.btnIdioma.setOnClickListener { alternarIdioma() }
        binding.btnAlterar.setOnClickListener { atualizarTexto() }
    }
    private fun mudarTema() {
        val isNight = AppCompatDelegate.getDefaultNightMode() ==
                AppCompatDelegate.MODE_NIGHT_YES
        val novoModo = if (isNight) {
            AppCompatDelegate.MODE_NIGHT_NO
        } else {
            AppCompatDelegate.MODE_NIGHT_YES
        }
        AppCompatDelegate.setDefaultNightMode(novoModo)
    }
    private fun alternarIdioma() {
        val idiomaAtual = AppCompatDelegate.getApplicationLocales()
        val usandoIngles = !idiomaAtual.isEmpty && idiomaAtual[0]?.language == "en"
        val proximoIdioma = if (usandoIngles) "pt" else "en"
        AppCompatDelegate.setApplicationLocales(
            LocaleListCompat.forLanguageTags(proximoIdioma)
        )
    }
    private fun atualizarTexto() {
        val nome = binding.etNome.text.toString()
        val email = binding.etEmail.text.toString()
        binding.tvNome.text = nome
        binding.tvEmail.text = email
    }
}
