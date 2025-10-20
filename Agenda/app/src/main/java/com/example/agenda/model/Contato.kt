package com.example.agenda.model

import java.io.Serializable

data class Contato(
    val foto: Int,
    val telefone: String,
    val email: String,
    val nome: String
) : Serializable