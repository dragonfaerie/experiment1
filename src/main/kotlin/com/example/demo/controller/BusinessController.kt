package com.example.demo.controller

import com.example.demo.entity.Business
import com.example.demo.service.BusinessService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/business")
class BusinessController(
    private val businessService: BusinessService,
) : BaseController() {
    @GetMapping("/all")
    fun getAllBusinesses(): List<Business> {
        val listOfBusinesses = businessService.getAllBusinesses()
        return (listOfBusinesses)
    }
}
