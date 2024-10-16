package com.example.demo.entity

import jakarta.persistence.*

@Entity
@Table(name = "barn", schema = "horsegame")
data class Barn(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val barn_name: String = "",
    val owner: Int = 0,
    val size: Int = 0,
    val feed_room: Boolean = false,
    val tack_room: Boolean = false,
    val shower_stall: Boolean = false,
    val indoor_arena: Boolean = false,
    val outdoor_arena: Boolean = false,
)
