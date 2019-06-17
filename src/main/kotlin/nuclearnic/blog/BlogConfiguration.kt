package nuclearnic.blog

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository) = ApplicationRunner {

        val kotlinmanguy = userRepository.save(User("kotlinmanguy", "Kotlinman", "Guy"))
        articleRepository.save(Article(
                title = "Kotlin for the Masses",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = kotlinmanguy
        ))
        articleRepository.save(Article(
                title = "Why everyone should leave Java",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = kotlinmanguy
        ))
    }
}