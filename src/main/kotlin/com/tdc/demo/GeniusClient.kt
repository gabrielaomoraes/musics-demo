package com.tdc.demo

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToFlux
import reactor.core.publisher.Flux

@Component
class GeniusClient(val baseUrl: String) {

    val client = WebClient.create("https://client-domain.com");

    fun call(id: Int) : Flux<GeniusResponse> =
        client
            .get()
            .uri("annotations/$id")
            .retrieve()
            .bodyToFlux<GeniusResponse>()


}

data class GeniusResponse(val id: String, val outra: String)