package com.example.demo

import org.springframework.stereotype.Repository
import java.io.File

@Repository
class HorseRepository {
    fun nameme(): List<Horse> {
        val horses = mutableListOf<Horse>()
        File("/Users/kit/Documents/code/experiment1/src/main/kotlin/tempdb").forEachLine { line ->
            line.length
            val horse = line.split(",")
            if (horse.isNotEmpty()) {
                horses.add(
                    Horse(
                        id = horse[0],
                        name = horse[1],
                        breed = horse[2]
                    )
                )
            }
        }
        return horses
    }
}