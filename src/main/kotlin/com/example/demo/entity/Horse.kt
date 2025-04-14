package com.example.demo.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "horse", schema = "horsegame")
data class Horse(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val horseName: String = "",
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
    val currentLocation: String = "",
    @ManyToOne
    @JoinColumn(name = "home_barn", nullable = false)
    val homeBarn: Barn,
    val discipline: String = "",
) {
    constructor() : this(0, "", "", "", "", 1, "Gelding", 0, 0, false, false, false, false, 0, "", Barn(), "")
}
