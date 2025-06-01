package com.sf.kafkaintegration.domain.model

/** Represents a generic message in the domain layer */
interface Message {
    val id: String
    val payload: String
    val timestamp: Long
}
