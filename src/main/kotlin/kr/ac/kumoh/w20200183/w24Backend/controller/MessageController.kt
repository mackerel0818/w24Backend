package kr.ac.kumoh.w20200183.w24Backend.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["https://stirring-bublanina-f6480a.netlify.app"])
class MessageController {

    @GetMapping
    fun getRoot() = mapOf("status" to "root")

    @GetMapping("/api/message")
    fun getMessage() = mapOf("status" to "success")
}