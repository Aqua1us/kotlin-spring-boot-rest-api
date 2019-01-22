package com.amtkxa.kotlinspringbootrestapi.user

import lombok.NonNull
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(@NonNull private val userService: UserService) {

    @GetMapping(path = ["/api/user"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun findAll(): List<User> = userService.findAll()
}
