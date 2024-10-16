package com.example.demo.controller

import com.example.demo.entity.Barn
import com.example.demo.service.BarnService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/barn")
class BarnController(
    private val barnService: BarnService,
) : BaseController() {
    @GetMapping("/all")
    fun getAllBarns(): List<Barn> {
        val listOfBarns = barnService.getAllBarns()
        return (listOfBarns)
    }

    @PostMapping
    fun createBarn(
        @RequestBody barn: Barn,
    ): ResponseEntity<Barn> = ResponseEntity.status(HttpStatus.CREATED).body(barnService.createBarn(barn))

    @GetMapping("/{id}")
    fun getBarnById(
        @PathVariable id: Long,
    ): ResponseEntity<Barn> =
        barnService.getBarnById(id)?.let { ResponseEntity.ok(it) }
            ?: ResponseEntity.notFound().build()

    @PatchMapping("/{id}")
    fun updateBarn(
        @PathVariable id: Long,
        @RequestBody updatedBarn: Barn,
    ): ResponseEntity<Barn> {
        val existingBarn = barnService.getBarnById(id)

        return if (existingBarn != null) {
            val updated = barnService.updateBarn(id, updatedBarn)
            ResponseEntity.ok(updated)
        } else {
            ResponseEntity.notFound().build()
        }
    }
}
