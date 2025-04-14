package com.example.demo.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "business", schema = "horsegame")
data class Business(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val businessId: Long = 0,
    val businessName: String,
    val businessOwner: Int,
    val businessTypeId: Int,
//    val createdAt: LocalDate = LocalDate.now(),
//    val updatedAt: LocalDate = LocalDate.now(),
) {
    constructor() : this(0, "", 0, 0)
}
