package com.tdc.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/rest/musics")
class MusicsController(val repository: MusicsRepository) {

    @GetMapping
    fun listAllMusics(): Flux<Music> {
        return repository.findAll()
    }
}