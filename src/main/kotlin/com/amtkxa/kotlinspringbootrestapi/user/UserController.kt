package com.amtkxa.kotlinspringbootrestapi.user

import lombok.NonNull
import lombok.RequiredArgsConstructor
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
class UserController(@NonNull private val userRepository: UserRepository) {

    @GetMapping(path = ["/api/user"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun findAll(): List<User> = userRepository.findAll()
}
