package com.example.demo.entity

import jakarta.persistence.*


@Entity
@Table(name = "horse")
data class Horse(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val horse_id: Long = 0,
    val horse_name: String,
    val color: String,
    val pattern: String
)
