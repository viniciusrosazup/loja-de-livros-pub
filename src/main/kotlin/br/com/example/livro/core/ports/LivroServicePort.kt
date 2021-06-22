package br.com.example.livro.core.ports

import br.com.example.livro.entrypoint.model.Livro
import br.com.example.livro.entrypoint.dto.LivroDto
import javax.inject.Singleton

@Singleton
interface LivroServicePort {
    fun livroMessage(livro: Livro): LivroDto
}