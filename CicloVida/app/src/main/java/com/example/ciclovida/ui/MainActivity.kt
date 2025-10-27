package com.example.ciclovida.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.ciclovida.R

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "CicloDeVida"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate chamado")
        setContentView(R.layout.activity_cadastro_contato)
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart chamado")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume chamado")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause chamado")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop chamado")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart chamado")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy chamado")
    }
}