package com.sf.kafkaintegration.domain.port

import com.sf.kafkaintegration.domain.model.Message

interface MessagePort : Port {
    suspend fun send(message: Message)

    suspend fun receive(topic: String): Message?
}
