package com.example.catalog

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.catalog.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
    }
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ArrayAdapter<String>

    private lateinit var cursos: Array<String>
    private lateinit var descrisoes: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cursos = arrayOf(
            getString(R.string.nome_ads),
            getString(R.string.nome_eng),
            getString(R.string.nome_mat),
            getString(R.string.nome_tsi)
        )

        descrisoes = arrayOf(
            getString(R.string.desc_ads),
            getString(R.string.desc_eng),
            getString(R.string.desc_mat),
            getString(R.string.desc_tsi)
        )

        setupViews()
        setupListeners()
    }
    private fun setupViews() {
        adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            cursos
        )
        binding.listaNomes.adapter = adapter

        binding.tvTitulo.text = getString(R.string.clique_curso)
    }
    private fun setupListeners() {
        binding.listaNomes.setOnItemClickListener {_, _, position, _ ->
            val curso = cursos[position]
            val descricao = descrisoes[position]
            mostrarMensagem("Curso selecionado: $curso")
            binding.tvDescricao.text = descricao
        }
    }
    private fun mostrarMensagem(mensagem: String) {
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
    }
}