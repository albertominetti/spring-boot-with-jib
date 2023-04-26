package ch.minetti.springbootwithjib

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class SpringBootWithJibApplication

fun main(args: Array<String>) {
    runApplication<SpringBootWithJibApplication>(*args)
}
