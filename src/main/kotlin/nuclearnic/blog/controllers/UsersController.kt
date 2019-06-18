package nuclearnic.blog.controllers

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
        return "users"
    }

}