package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/horses")
class HorseController(
    private val horseService: HorseService
): BaseController() {
    @GetMapping("/all")
    fun getAllHorses(
        //needed values go here
    ): List<Horse> {
        val listOfPonies = horseService.getAllHorses()
        return (listOfPonies)
    }

//    @PostMapping("/new")
//    fun createNewHorse(
//
//    ): Horse {
//        val horse = horseService.createNewHorse()
//        return (horse)
//    }
}