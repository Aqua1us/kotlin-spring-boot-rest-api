package com.amtkxa.kotlinspringbootrestapi.user

import lombok.NonNull
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class UserService(@NonNull private val userRepository: UserRepository) {

    fun findAll(): List<User> = userRepository.findAll()
}
