package com.example.ktlintdemo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.util.UUID

@SpringBootTest
internal class KtlintDemoApplicationTests {
    @Suppress("ktlint:standard:property-naming")
    private val test_id = UUID.randomUUID()

    @Test
    fun contextLoads() {
        println("Test ID: $test_id")
    }
}
