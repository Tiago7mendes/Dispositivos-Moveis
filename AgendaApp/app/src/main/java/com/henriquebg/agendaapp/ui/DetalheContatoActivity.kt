package com.henriquebg.agendaapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.henriquebg.agendaapp.R
import com.henriquebg.agendaapp.databinding.ActivityDetalheContatoBinding
import com.henriquebg.agendaapp.model.Contato

class DetalheContatoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalheContatoBinding
    private lateinit var contato : Contato

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheContatoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        setupViews()
        setupListeners()
    }

    private fun loadData()
    {
        contato = intent.getSerializableExtra("contato", Contato::class.java) as Contato
    }

    private fun setupViews()
    {
        binding.tvNome.text = contato.nome
        binding.tvTelefone.text = contato.telefone
        binding.tvEmail.text = contato.email
        binding.imgFoto.setImageURI(contato.foto.toUri())
    }

    private fun setupListeners() {
        binding.btnLigar.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = "tel:${contato.telefone}".toUri()
            startActivity(intent)
        }
        binding.btnEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = "mailto:${contato.email}".toUri()
            startActivity(intent)
        }

        binding.btnVoltar.setOnClickListener {
            finish()
        }
    }
}