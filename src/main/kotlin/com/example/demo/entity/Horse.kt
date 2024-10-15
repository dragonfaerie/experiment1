package com.example.demo.entity

import jakarta.persistence.*


@Entity
@Table(name = "horse", schema = "horsegame")
data class Horse(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val horse_name: String = "",
    val color: String = "",
    val pattern: String = ""
)
