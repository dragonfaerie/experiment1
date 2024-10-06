package com.example.demo.controller

import com.example.demo.entity.Horse
import com.example.demo.service.HorseService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/horses")
class HorseController(
    private val horseService: HorseService
): BaseController() {
    @GetMapping("/all")
    fun getAllHorses(): List<Horse> {
        val listOfPonies = horseService.getAllHorses()
        return (listOfPonies)
    }

    @PostMapping
    fun createHorse(@RequestBody horse: Horse): ResponseEntity<Horse> =
        ResponseEntity.status(HttpStatus.CREATED).body(horseService.createHorse(horse))

//    @GetMapping("{id}")
//    fun getHorse(): Horse {
//        val horse = horseService.getHorse()
//        return horse
//    }
}

//
//@RestController
//@RequestMapping("/users")
//class UserController(private val userService: UserService) {
//
//    @GetMapping
//    fun getAllUsers(): List<User> = userService.getAllUsers()
//
//    @GetMapping("/{id}")
//    fun getUserById(@PathVariable id: Long): ResponseEntity<User> =
//        userService.getUserById(id)?.let { ResponseEntity.ok(it) }
//            ?: ResponseEntity.notFound().build()
//
//    @PostMapping
//    fun createUser(@RequestBody user: User): ResponseEntity<User> =
//        ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user))
//
//    @DeleteMapping("/{id}")
//    fun deleteUser(@PathVariable id: Long): ResponseEntity<Void> {
//        userService.deleteUser(id)
//        return ResponseEntity.noContent().build()
//    }



//    @GetMapping("/{invoiceId}")
//    fun getInvoice(
//        @PathVariable organizationKey: String,
//        @PathVariable invoiceId: String,
//    ): ResponseEntity<ByteArray> {
//        setMDC(organizationKey)
//
//        val globalKey = proService.getOrganization(organizationKey).globalKey()
//        val invoice = invoiceService.getInvoice(globalKey, invoiceId)
//
//        return ResponseEntity.ok()
//            .contentLength(invoice.size.toLong())
//            .contentType(MediaType.APPLICATION_PDF)
//            .body(invoice)
//    }
//}
