package com.example.demo.repository

import com.example.demo.entity.Business
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface BusinessRepository : JpaRepository<Business, Long> {
    fun findBusinessByBusinessId(businessId: Long): Optional<Business>
}
