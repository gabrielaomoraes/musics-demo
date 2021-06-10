package com.tdc.demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.http.MediaType.TEXT_HTML
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class RouterConfiguration {

    @Bean
    fun music(handler: MusicsHandler) = router {
        accept(TEXT_HTML).nest {
            (GET("/musics") or GET("/musics/")).invoke(handler::getAllMusics)
        }
    }
}