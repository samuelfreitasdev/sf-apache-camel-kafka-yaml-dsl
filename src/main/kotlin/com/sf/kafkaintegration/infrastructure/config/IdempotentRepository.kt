package com.sf.kafkaintegration.infrastructure.config

import org.apache.camel.processor.idempotent.kafka.KafkaIdempotentRepository
import org.springframework.stereotype.Component

@Component
@org.apache.camel.spi.annotations.Component("kafkaIdempotentRepository")
class IdempotentRepository: KafkaIdempotentRepository() {
}