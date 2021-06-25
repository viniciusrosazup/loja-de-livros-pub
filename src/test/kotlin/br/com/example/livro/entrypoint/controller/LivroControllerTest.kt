//package br.com.example.livro.entrypoint.controller
//
//import br.com.example.livro.core.ports.LivroServicePort
//import br.com.example.livro.entrypoint.dto.LivroDto
//import br.com.example.livro.entrypoint.model.LivroReserve
//import io.kotest.core.spec.style.AnnotationSpec
//import io.kotest.core.spec.style.FunSpec
//
//import io.kotest.matchers.types.shouldBeTypeOf
//import io.micronaut.http.client.HttpClient
//import io.micronaut.http.client.annotation.Client
//import io.micronaut.test.extensions.kotest.annotation.MicronautTest
//import io.mockk.MockKAnnotations
//import io.mockk.every
//import io.mockk.mockk
//import org.junit.jupiter.api.BeforeEach
//import org.junit.jupiter.api.Test
//import javax.inject.Inject
//
//@MicronautTest
//class LivroControllerTest : FunSpec({
//    val service = mockk<LivroServicePort>(relaxed = true)
//
//    val livroController = LivroController(service)
//
//    lateinit var livro: LivroReserve
//    lateinit var livroDto: LivroDto
//
//    @AnnotationSpec.BeforeEach
//    fun setUp() {
//        MockKAnnotations.init(this)
//        livro = LivroReserve(null, "Vinicius Rosa", "As viagens do peregrino da alvorada", "", "", 10.90)
//        livroDto = LivroDto(null, "Vinicius Rosa", "As viagens do peregrino da alvorada", "", "", 10.90)
//
//    }
//
//    @Test
//    fun `deve cadastrar um livro`() {
//        every { service.livroMessage(livro) } returns LivroDto()
//
//        val result = livroController.createLivro(livroDto)
//
//        result.shouldBeTypeOf<LivroDto>()
//    }
//
//
//})
