package com.amtkxa.kotlinspringbootrestapi.user

import lombok.NonNull
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class UserController(@NonNull private val userService: UserService) {

    @GetMapping(path = ["/api/user"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun findAll(): ResponseEntity<List<User>> {
        return ResponseEntity.ok(userService.findAll())
    }

    @GetMapping(path = ["/api/user/{id}"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun findById(@PathVariable(value = "id") id: Long): ResponseEntity<User> {
        val user = userService.findById(id = id)
        return if (user != null) {
            ResponseEntity.ok(user)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @PostMapping(path = ["/api/user"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun create(@RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity.ok(userService.create(user))
    }

    @PutMapping(path = ["/api/user/{id}"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun update(@PathVariable(value = "id") id: Long, @RequestBody user: User): ResponseEntity<User> {
        val user = userService.update(id, user)
        return if (user != null) {
            ResponseEntity.ok(user)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @DeleteMapping(path = ["/api/user/{id}"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun destroy(@PathVariable(value = "id") id: Long): ResponseEntity<Unit> {
        return ResponseEntity.ok(userService.deleteById(id))
    }
}
