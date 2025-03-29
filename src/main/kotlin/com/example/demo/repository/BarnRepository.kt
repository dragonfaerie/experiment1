package com.example.demo.repository

import com.example.demo.entity.Barn
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BarnRepository : JpaRepository<Barn, Long> {
    fun findBarnByBarnId(barnId: Long): Optional<Barn>

    override fun findAll(): List<Barn>
}
