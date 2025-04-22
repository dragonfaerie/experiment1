package com.example.demo.service

import com.example.demo.entity.Business
import com.example.demo.repository.BusinessRepository
import com.example.demo.repository.BusinessTypeRepository

class BusinessService(
    private val businessRepository: BusinessRepository,
    private val businessTypeRepository: BusinessTypeRepository,
) {
    fun getAllBusinesses(): List<Business> = businessRepository.findAll()
}
