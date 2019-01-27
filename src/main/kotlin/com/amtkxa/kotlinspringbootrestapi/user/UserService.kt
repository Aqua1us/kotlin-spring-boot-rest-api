package com.amtkxa.kotlinspringbootrestapi.user

import lombok.NonNull
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@RequiredArgsConstructor
class UserService(@NonNull private val userRepository: UserRepository) {

    @Transactional(readOnly = true)
    fun findAll(): List<User> {
        return userRepository.findAll()
    }

    @Transactional(readOnly = true)
    fun findById(id: Long): User? {
        return userRepository.findById(id).orElseGet(null)
    }

    fun create(user: User): User {
        return userRepository.save(user)
    }
}
