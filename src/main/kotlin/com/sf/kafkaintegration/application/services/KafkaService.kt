package com.sf.kafkaintegration.application.services

import org.apache.camel.ProducerTemplate
import org.springframework.stereotype.Service

/** @param producerTemplate */
@Service
class KafkaService(
    private val producerTemplate: ProducerTemplate,
) {
    /** @param message */
    fun sendMessage(message: String) {
        producerTemplate.sendBody("direct:send-to-kafka", message)
    }
}
