package com.example.demo.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDate

@Entity
@Table(name = "barn", schema = "horsegame")
data class Barn(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val barnId: Long = 0,
    val barnName: String = "",
    val owner: Int = 0,
    val size: Int = 0,
    val feedRoom: Boolean = false,
    val tackRoom: Boolean = false,
    val showerStall: Boolean = false,
    val indoorArena: Boolean = false,
    val outdoorArena: Boolean = false,
    val createdAt: LocalDate = LocalDate.now(),
    val updatedAt: LocalDate = LocalDate.now(),
) {
    constructor() : this(0, "", 0, 0, false, false, false, false, false)
}
