package com.sf.kafkaintegration.interfaces.dto

import com.sf.kafkaintegration.domain.model.Message
import java.time.Instant

data class MessageDTO(
    override val id: String,
    override val payload: String,
    override val timestamp: Long = Instant.now().toEpochMilli(),
) : Message
