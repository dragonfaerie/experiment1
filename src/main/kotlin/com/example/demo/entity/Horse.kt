package com.example.demo.entity

import jakarta.persistence.*

@Entity
@Table(name = "horse", schema = "horsegame")
data class Horse(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val horse_name: String = "",
    val breed: String = "",
    val color: String = "",
    val pattern: String = "",
    val age: Int = 1,
    val gender: String = "Gelding",
    val training: Int = 0,
    val health: Int = 0,
    val vet: Boolean = false,
    val farrier: Boolean = false,
    val food: Boolean = false,
    val water: Boolean = false,
    val owner: Int = 0,
    val current_location: String = "",
    val home_barn: Int = 0,
    val discipline: String = "",
)
