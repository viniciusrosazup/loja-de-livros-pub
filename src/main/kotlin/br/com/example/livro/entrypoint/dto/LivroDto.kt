package br.com.example.livro.entrypoint.dto

import java.util.*


data class LivroDto(
    val id: UUID? = null,
    val autor: String = "",
    val description: String = "",
    val numero_de_paginas: String = "",
    val isbn: String = "",
    val preco: Double = 0.0
) {

}
