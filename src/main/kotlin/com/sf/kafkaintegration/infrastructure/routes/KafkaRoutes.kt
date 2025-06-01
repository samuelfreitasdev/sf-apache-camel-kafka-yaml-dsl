package com.sf.kafkaintegration.infrastructure.routes

import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

@Component
class KafkaRoutes : RouteBuilder() {
    override fun configure() {
        // Exemplo de rota para consumir mensagens
        from("kafka:example-topic?groupId=my-group").log("Mensagem recebida: \${body}").process { exchange ->
            // Aqui você pode processar a mensagem
            val message = exchange.getIn().getBody(String::class.java)
            // Faça o processamento necessário
        }

        // Exemplo de rota para produzir mensagens
        from("direct:send-to-kafka").log("Enviando mensagem: \${body}").to("kafka:example-topic")
    }
}
