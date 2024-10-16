package com.example.demo.controller

import com.example.demo.entity.Horse
import com.example.demo.service.HorseService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/horse")
class HorseController(
    private val horseService: HorseService,
) : BaseController() {
    @GetMapping("/all")
    fun getAllHorses(): List<Horse> {
        val listOfPonies = horseService.getAllHorses()
        return (listOfPonies)
    }

    @PostMapping
    fun createHorse(
        @RequestBody horse: Horse,
    ): ResponseEntity<Horse> = ResponseEntity.status(HttpStatus.CREATED).body(horseService.createHorse(horse))

    @GetMapping("/{id}")
    fun getUserById(
        @PathVariable id: Long,
    ): ResponseEntity<Horse> =
        horseService.getHorseById(id)?.let { ResponseEntity.ok(it) }
            ?: ResponseEntity.notFound().build()

    @PatchMapping("/{id}")
    fun updateHorse(
        @PathVariable id: Long,
        @RequestBody updatedHorse: Horse,
    ): ResponseEntity<Horse> {
        val existingHorse = horseService.getHorseById(id)

        return if (existingHorse != null) {
            val updated = horseService.updateHorse(id, updatedHorse)
            ResponseEntity.ok(updated)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @DeleteMapping("/{id}")
    fun deleteHorse(
        @PathVariable id: Long,
    ): ResponseEntity<Void> {
        horseService.deleteHorse(id)
        return ResponseEntity.noContent().build()
    }
}
