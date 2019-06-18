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
        articleRepository.save(Article( title = "Kotlin for the Masses", headline = "Lorem ipsum", content = "dolor sit amet", author = kotlinmanguy ))
        articleRepository.save(Article( title = "Why everyone should leave Java", headline = "Lorem ipsum", content = "dolor sit amet", author = kotlinmanguy ))


        val tenderlove = userRepository.save(User("tenderlove", "Tender", "Love"))
        articleRepository.save(Article( title = "Tender Code for Rubyists", headline = "Lorem ipsum", content = "dolor sit amet", author = tenderlove ))
        articleRepository.save(Article( title = "Metaprogramming in Ruby", headline = "Lorem ipsum", content = "dolor sit amet", author = tenderlove ))

        val pythonmanguy = userRepository.save(User("tenderlove", "Pythonman", "Guy"))
        articleRepository.save(Article( title = "Can you Guys even Machine Learn?", headline = "Lorem ipsum", content = "dolor sit amet", author = pythonmanguy ))

        val elixirmanguy = userRepository.save(User("elixirmanguy", "Elixirman", "Guy"))
        articleRepository.save(Article( title = "I Concurrent better than any of Ya'll", headline = "Lorem ipsum", content = "dolor sit amet", author = elixirmanguy ))
    }
}