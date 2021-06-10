package com.tdc.demo

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MusicsRepository : ReactiveCrudRepository<Music, String>