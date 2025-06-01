package com.sf.kafkaintegration.infrastructure.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class CamelConfig {
    @Value("\${spring.kafka.bootstrap-servers}")
    private lateinit var bootstrapServers: String
}
