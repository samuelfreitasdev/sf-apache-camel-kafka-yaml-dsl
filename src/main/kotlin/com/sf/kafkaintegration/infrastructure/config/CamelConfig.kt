package com.sf.kafkaintegration.infrastructure.config

import org.apache.camel.builder.RouteBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CamelConfig {

    @Bean
    fun demoRoute(): RouteBuilder = object : RouteBuilder() {
        override fun configure() {
            from("timer:demo?period=5000")
                .setBody { "Hello from Camel at ${System.currentTimeMillis()}" }
                .log("\${body}")
        }
    }
}
