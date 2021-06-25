package br.com.example.livro.entrypoint.controller

import br.com.example.livro.core.mapper.LivroConverter
import br.com.example.livro.core.ports.LivroServicePort
import br.com.example.livro.entrypoint.dto.LivroDto
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
    fun createLivro(@Body request: LivroDto): LivroDto {
        logger.info("Chamando o metodo do service{}")
        return service.livroMessage(LivroConverter.livroDtoToLivro(request))
    }


}