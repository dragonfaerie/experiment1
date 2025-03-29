package com.example.demo.service

import com.example.demo.entity.Horse
import com.example.demo.repository.HorseRepository
import org.springframework.stereotype.Service

@Service
class HorseService(
    private val horseRepository: HorseRepository,
) {
    fun getAllHorses(): List<Horse> = horseRepository.findAll()

    fun createHorse(horse: Horse): Horse = horseRepository.save(horse)

    fun getHorseById(id: Long): Horse? = horseRepository.findHorseById(id).orElse(null)

    fun updateHorse(
        id: Long,
        updatedHorse: Horse,
    ): Horse {
        val existingHorse =
            horseRepository.findById(id).orElseThrow {
                throw RuntimeException("Horse not found")
            }

        val horseToUpdate =
            existingHorse.copy(
                horseName = updatedHorse.horseName,
                color = updatedHorse.color,
                pattern = updatedHorse.pattern,
            )

        return horseRepository.save(horseToUpdate)
    }

    fun deleteHorse(id: Long) = horseRepository.deleteById(id)
}
