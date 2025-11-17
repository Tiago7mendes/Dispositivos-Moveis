package com.henriquebg.agendaapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.henriquebg.agendaapp.databinding.ItemContatoBinding
import com.henriquebg.agendaapp.model.Contato

class ContatoAdapter(
    private var contatos: List<Contato>,
    private val onClick: (Contato) -> Unit
) : RecyclerView.Adapter<ContatoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemContatoBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(contatos[position])
    }

    override fun getItemCount(): Int = contatos.size

    inner class ViewHolder(val binding: ItemContatoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(contato: Contato) {
            binding.imgFoto.setImageURI(contato.foto.toUri())
            binding.tvNome.text = contato.nome
            binding.tvTelefone.text = contato.telefone
            binding.tvEmail.text = contato.email
            binding.root.setOnClickListener { onClick(contato) }
        }
    }

    fun updateLista(novosContatos: List<Contato>) {
        this.contatos = novosContatos
        notifyDataSetChanged()
    }
}