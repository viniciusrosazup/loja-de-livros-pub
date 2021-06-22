package br.com.example.livro.entrypoint.controller

import br.com.example.livro.core.ports.LivroServicePort
import br.com.example.livro.entrypoint.dto.LivroDto
import br.com.example.livro.entrypoint.model.Livro
import io.micronaut.http.MediaType.APPLICATION_JSON
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import org.slf4j.LoggerFactory

@Controller("api/livros")
class LivroController(private val service: LivroServicePort) {

    val logger = LoggerFactory.getLogger(this::class.java)

    @Post("cadastro")
    @Produces(APPLICATION_JSON)
    fun createLivro(@Body request: LivroDto): Livro {
        val livro = request.toModel()

        logger.info("Chamando o metodo do service{}")

        service.livroMessage(
            Livro(
                livro.id,
                livro.autor,
                livro.description,
                livro.numero_de_paginas,
                livro.isbn,
                livro.preco
            )
        )

        return livro


    }


}