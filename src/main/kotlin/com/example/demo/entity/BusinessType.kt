package com.example.demo.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "business_type", schema = "horsegame")
data class BusinessType(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val businessTypeId: Int,
    val businessType: String,
    val businessStatus: Boolean,
)
