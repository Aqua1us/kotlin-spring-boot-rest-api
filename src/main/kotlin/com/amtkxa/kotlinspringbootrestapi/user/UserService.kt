package com.amtkxa.kotlinspringbootrestapi.user

import lombok.NonNull
import lombok.RequiredArgsConstructor
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class UserService(@NonNull private val userRepository: UserRepository) {

    fun findAll(): List<User> =
        userRepository.findAll()

    fun findById(id: Long): ResponseEntity<User> =
        userRepository.findById(id).map { user ->
            ResponseEntity.ok(user)
        }.orElse(ResponseEntity.notFound().build())

}
