package ch.minetti.springbootwithjib

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest(webEnvironment = RANDOM_PORT)
@AutoConfigureWebClient
class SpringBootWithJibApplicationTests(
        @Autowired private val webTestClient: WebTestClient
) {

    @Test
    fun contextLoads() {
        webTestClient.get().uri("/").exchange().expectStatus().isOk
    }

}
