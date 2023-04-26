package ch.minetti.springbootwithjib

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class SampleController {


    @GetMapping("/")
    fun get(): ResponseForGet {
        return ResponseForGet("ok")
    }

    class ResponseForGet(val message: String) {
        val timestamp = LocalDateTime.now()
    }
}