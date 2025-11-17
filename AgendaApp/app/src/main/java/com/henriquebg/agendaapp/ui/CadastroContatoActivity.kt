package com.henriquebg.agendaapp.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.henriquebg.agendaapp.databinding.ActivityCadastroBinding
import androidx.appcompat.app.AppCompatActivity
import com.henriquebg.agendaapp.R
import com.henriquebg.agendaapp.model.Contato

class CadastroContatoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding
    private lateinit var launcherGaleria: ActivityResultLauncher<Array<String>>
    private lateinit var uriSelecionada: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupLauncher()
        setupListeners()
    }
    private fun setupLauncher(){
        launcherGaleria = registerForActivityResult(
            ActivityResultContracts.OpenDocument()
        ) { uri ->
            if (uri != null) {
                contentResolver.takePersistableUriPermission(
                    uri,
                    Intent.FLAG_GRANT_READ_URI_PERMISSION
                )
                uriSelecionada = uri.toString()
                binding.imgFoto.setImageURI(uri)
            }
        }
    }
    private fun setupListeners() {
        binding.imgFoto.setOnClickListener {
            launcherGaleria.launch(arrayOf("image/*"))
        }
        binding.btnSalvar.setOnClickListener {
            val foto = uriSelecionada
            val nome = binding.edtNome.text.toString()
            val telefone = binding.edtTelefone.text.toString()
            val email = binding.edtEmail.text.toString()
            if (nome.isNotBlank() && telefone.isNotBlank() && email.isNotBlank()) {
                val novoContato = Contato(
                    foto = foto,
                    nome = nome,
                    telefone = telefone,
                    email = email
                )
                val resultIntent = Intent().apply {
                    putExtra("contato", novoContato)
                }
                setResult(Activity.RESULT_OK, resultIntent)
                finish()
            }
            else{
                Toast.makeText(this, "Preencha todos os campos",
                    Toast.LENGTH_SHORT).show()
            }
        }
        binding.btnVoltar.setOnClickListener {
            setResult(Activity.RESULT_CANCELED)
            finish()
        }
    }
}