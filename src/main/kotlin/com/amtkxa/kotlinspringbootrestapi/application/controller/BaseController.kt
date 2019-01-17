package com.amtkxa.kotlinspringbootrestapi.application.controller

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BaseController {

    @GetMapping(path = [""], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun base(): ResponseEntity<String> {
        return ResponseEntity.ok("success")
    }
}
