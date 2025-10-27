package com.example.ciclovida.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ciclovida.R
import com.example.ciclovida.databinding.ActivityCadastroContatoBinding
import com.example.ciclovida.model.Contato

class CadastroContatoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCadastroContatoBinding
    private lateinit var contato: Contato
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroContatoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onPause() {
        super.onPause()
        contato = Contato(
            nome = binding.edtNome.text.toString(),
            telefone = binding.edtTelefone.text.toString(),
            email = binding.edtEmail.text.toString(),
            foto = R.drawable.ic_launcher_foreground
        )
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putSerializable("contato", contato)
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        contato = savedInstanceState.getSerializable("contato") as Contato
        setupViews()
    }
    private fun setupViews() {
        binding.edtNome.setText(contato.nome)
        binding.edtTelefone.setText(contato.telefone)
        binding.edtEmail.setText(contato.email)
    }
}