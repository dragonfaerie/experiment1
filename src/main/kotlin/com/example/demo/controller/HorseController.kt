package com.example.demo.controller

import com.example.demo.entity.Horse
import com.example.demo.service.HorseService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/horses")
class HorseController(
    private val horseService: HorseService
): BaseController() {
    @GetMapping("/all")
    fun getAllHorses(
        //needed values go here
    ): List<Horse> {
        val listOfPonies = horseService.getAllHorses()
        return (listOfPonies)
    }
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
