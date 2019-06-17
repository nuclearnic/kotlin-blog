package nuclearnic.blog

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.data.repository.findByIdOrNull

@DataJpaTest
class RepositoriesTests @Autowired constructor(
        val entityManager: TestEntityManager,
        val userRepository: UserRepository,
        val articleRepository: ArticleRepository) {

    @Test
    fun `When findByIdOrNull then return Article`() {
        val kotlinmanguy = User("kotlinmanguy", "Kotlin", "Manguy")
        entityManager.persist(kotlinmanguy)
        val article = Article(
                "Kotlin for the Masses",
                "How to become a Kotlin guy, just like me!",
                "Lorem ipsum",
                kotlinmanguy)
        entityManager.persist(article)
        entityManager.flush()
        val found = articleRepository.findByIdOrNull(article.id!!)
        assertThat(found).isEqualTo(article)
    }

    @Test
    fun `When findByLogin then return User`() {
        val kotlinmanguy = User("kotlinmanguy", "Kotlin", "Manguy")
        entityManager.persist(kotlinmanguy)
        entityManager.flush()
        val user = userRepository.findByLogin(kotlinmanguy.login)
        assertThat(user).isEqualTo(kotlinmanguy)
    }
}