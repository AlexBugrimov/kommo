package dev.bug.kommo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KommoApplication

fun main(args: Array<String>) {
    runApplication<KommoApplication>(*args)
}
