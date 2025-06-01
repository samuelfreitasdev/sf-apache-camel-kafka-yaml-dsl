package com.sf.kafkaintegration.application.usecase

import com.sf.kafkaintegration.domain.model.Message
import com.sf.kafkaintegration.domain.port.MessagePort

class SendMessageUseCase(private val messagePort: MessagePort) {
    suspend fun execute(message: Message) {
        messagePort.send(message)
    }
}
