package com.onion

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class OnionApplication

fun main(args: Array<String>) {
    SpringApplication.run(OnionApplication::class.java, *args)
}
