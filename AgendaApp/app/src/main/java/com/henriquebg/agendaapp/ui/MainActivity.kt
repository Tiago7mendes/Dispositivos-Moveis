package com.henriquebg.agendaapp.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.henriquebg.agendaapp.model.Contato
import com.henriquebg.agendaapp.adapter.ContatoAdapter
import com.henriquebg.agendaapp.R
import com.henriquebg.agendaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var contatos: MutableList<Contato>
    private lateinit var adapter: ContatoAdapter
    private lateinit var launcherCadastro: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        contatos = mutableListOf()
        setupRecyclerView()
        setupLauncherCadastro()
        setupListeners()
    }

    private fun setupRecyclerView() {
        adapter = ContatoAdapter(contatos) { contato ->
            val intent = Intent(this, DetalheContatoActivity::class.java)
            intent.putExtra("contato", contato)
            startActivity(intent)
        }

        binding.listViewContatos.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = this@MainActivity.adapter
            addItemDecoration(
                DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
            )
        }
    }

    private fun setupLauncherCadastro() {
        launcherCadastro = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data = result.data
                val novoContato = data?.getSerializableExtra("contato", Contato::class.java)

                if (novoContato != null) {
                    contatos.add(novoContato)
                    adapter.notifyItemInserted(contatos.size - 1)
                }
            }
        }
    }

    private fun setupListeners() {
        binding.btnAdicionar.setOnClickListener {
            val intent = Intent(this, CadastroContatoActivity::class.java)
            launcherCadastro.launch(intent)
        }
        binding.edtFiltro.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val filtro = s.toString().lowercase()
                val filtrados = contatos.filter {
                    it.nome.lowercase().contains(filtro)
                }
                adapter.updateLista(filtrados)
            }
            override fun afterTextChanged(s: Editable?) {}
        })
    }


}