package nuclearnic.blog

import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@WebMvcTest
class HttpControllersTests(@Autowired val mockMvc: MockMvc) {

    @MockkBean
    private lateinit var userRepository: UserRepository

    @MockkBean
    private lateinit var articleRepository: ArticleRepository

//    TODO: Fix the "index" endpoints
//    @Test
//    fun `List articles`() {
//        val kotlinmanguy = User("kotlinmanguy", "Kotlinman", "Guy")
//        val article1 = Article("Article #1 title", "Article #1 headline", "Article #1 content.", kotlinmanguy)
//        val article2 = Article("Article #2 title", "Article #2 headline", "Article #2 content.", kotlinmanguy)
//        every { articleRepository.findAllByOrderByAddedAtDesc() } returns listOf(article1, article2)
//        mockMvc.perform(get("/api/article").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk)
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(jsonPath("\$.[0].author.login").value(kotlinmanguy.login))
//                .andExpect(jsonPath("\$.[0].slug").value(article1.slug))
//                .andExpect(jsonPath("\$.[1].author.login").value(kotlinmanguy.login))
//                .andExpect(jsonPath("\$.[1].slug").value(article2.slug))
//    }
//
//    @Test
//    fun `List users`() {
//        val kotlinmanguy = User("kotlinmanguy", "Kotlinman", "Guy")
//        val rubymanguy = User("rubymanguy", "Rugyman", "Guy")
//        every { userRepository.findAll() } returns listOf(kotlinmanguy, rubymanguy)
//        mockMvc.perform(get("/api/user/").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk)
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(jsonPath("\$.[0].login").value(kotlinmanguy.login))
//                .andExpect(jsonPath("\$.[1].login").value(rubymanguy.login))
//    }
}