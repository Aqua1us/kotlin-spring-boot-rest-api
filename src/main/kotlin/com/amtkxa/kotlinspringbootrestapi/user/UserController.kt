package com.amtkxa.kotlinspringbootrestapi.user

import lombok.NonNull
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(@NonNull private val userService: UserService) {

    @GetMapping(path = ["/api/user"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun findAll(): List<User> =
        userService.findAll()

    @GetMapping(path = ["/api/user/{id}"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun findById(@PathVariable(value = "id") id: Long): ResponseEntity<User> =
        userService.findById(id = id)
}
