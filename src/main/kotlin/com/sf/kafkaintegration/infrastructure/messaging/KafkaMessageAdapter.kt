package com.sf.kafkaintegration.infrastructure.messaging

import com.sf.kafkaintegration.domain.model.Message
import com.sf.kafkaintegration.domain.port.MessagePort
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class KafkaMessageAdapter(
    private val kafkaTemplate: KafkaTemplate<String, String>
) : MessagePort {
    override suspend fun send(message: Message) {
        kafkaTemplate.send(message.id, message.payload)
    }

    override suspend fun receive(topic: String): Message? {
        // Implementation will be added with consumer configuration
        TODO("Not yet implemented")
    }
}
