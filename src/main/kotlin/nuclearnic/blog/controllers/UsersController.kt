package nuclearnic.blog.controllers

import nuclearnic.blog.User
import nuclearnic.blog.UserRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UsersController(private val repository: UserRepository) {

    @GetMapping("/users")
    fun users(model: Model): String {
        model["title"] = "Users"
        model["users"] = repository.findAll().map { it.render() }
        return "users"
    }

    fun User.render() = RenderedUser(
            login,
            firstname,
            lastname,
            description
    )

    data class RenderedUser(
            val login: String,
            val firstname: String,
            val lastname: String,
            val description: String?
    )

}