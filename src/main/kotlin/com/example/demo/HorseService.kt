package com.example.demo

import org.springframework.stereotype.Service

@Service
class HorseService(
    private val horseRepository: HorseRepository
) {
    fun getAllHorses(): List<Horse> {
        return horseRepository.nameme()
    }

//    fun createNewHorse(): Horse {
//        return horse
//    }
}