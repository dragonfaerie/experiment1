package com.example.demo.repository

import com.example.demo.entity.Horse
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface HorseRepository : JpaRepository<Horse, Long> {
    fun findHorseById(id: Long): Optional<Horse>
override fun findAll(): List<Horse>
}

//
//package com.example.myproject.repository
//
//import com.example.myproject.model.User
//import org.springframework.data.jpa.repository.JpaRepository
//
//interface UserRepository : JpaRepository<User, Long>
//ackage com.ramseysolutions.trusted.billing.service.repository
//
//import com.ramseysolutions.trusted.billing.service.entity.ProBillingStatus
//import org.springframework.data.repository.CrudRepository
//import org.springframework.stereotype.Repository
//
//@Repository
//interface ProBillingStatusRepository : CrudRepository<ProBillingStatus, Int> {
//    fun findAllByOrganizationKeyAndProgramKey(
//        organizationKey: String,
//        programKey: String,
//    ): List<ProBillingStatus>
//}

