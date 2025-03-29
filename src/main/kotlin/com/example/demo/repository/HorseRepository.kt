package com.example.demo.repository

import com.example.demo.entity.Barn
import com.example.demo.entity.Horse
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface HorseRepository : JpaRepository<Horse, Long> {
    fun findHorseById(id: Long): Optional<Horse>

    override fun findAll(): List<Horse>

    fun findAllByHomeBarn(homeBarn: Barn): List<Horse>
}
