package com.example.demo.service

import com.example.demo.entity.Barn
import com.example.demo.entity.Horse
import com.example.demo.repository.BarnRepository
import org.springframework.stereotype.Service

@Service
class BarnService(
    private val barnRepository: BarnRepository,
) {
    fun getAllBarns(): List<Barn> = barnRepository.findAll()

    fun createBarn(barn: Barn): Barn = barnRepository.save(barn)

    fun getBarnById(id: Long): Barn? = barnRepository.findBarnById(id).orElse(null)

    fun updateBarn(
        id: Long,
        updatedBarn: Barn,
    ): Barn {
        val existingBarn =
            barnRepository.findById(id).orElseThrow {
                throw RuntimeException("Barn not found")
            }

        val barnToUpdate =
            existingBarn.copy(
                barn_name = updatedBarn.barn_name,
                owner = updatedBarn.owner,
                size = updatedBarn.size,
                feed_room = updatedBarn.feed_room,
                tack_room = updatedBarn.tack_room,
                shower_stall = updatedBarn.shower_stall,
                indoor_arena = updatedBarn.indoor_arena,
                outdoor_arena = updatedBarn.outdoor_arena
            )

        return barnRepository.save(barnToUpdate)
    }
}
