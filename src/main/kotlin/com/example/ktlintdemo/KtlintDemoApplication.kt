package com.example.ktlintdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Main application entry point.
 */
@SpringBootApplication
class KtlintDemoApplication

/**
 * Entry point for application.
 *
 * @param args Command-line arguments
 */
fun main(args: Array<String>) {
    runApplication<KtlintDemoApplication>(*args)
}
