package dev.bug.kommo

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<KommoApplication>().with(TestcontainersConfiguration::class).run(*args)
}
