package com.example.demo.repository

import com.example.demo.entity.BusinessType
import java.util.Optional

interface BusinessTypeRepository {
    fun findBusinessTypeByBusinessTypeId(businessTypeId: Long): Optional<BusinessType>
}
