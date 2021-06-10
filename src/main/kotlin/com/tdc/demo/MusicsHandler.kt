package com.tdc.demo

import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono


class MusicsHandler(val repository: MusicsRepository) {

    fun getAllMusics(request: ServerRequest): Mono<ServerResponse> {
        return ok()
            .contentType(APPLICATION_JSON)
            .body(repository.findAll(), Music::class.java)
    }
}

data class Music(val id: Int, val name: String, val artist: String)