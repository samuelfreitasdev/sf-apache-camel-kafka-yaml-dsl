package com.sf.kafkaintegration.application.usecase

import com.sf.kafkaintegration.domain.model.Message
import com.sf.kafkaintegration.domain.port.MessagePort

/** @param messagePort */
class SendMessageUseCase(
    private val messagePort: MessagePort,
) {
    /** @param message */
    suspend fun execute(message: Message) {
        messagePort.send(message)
    }
}
