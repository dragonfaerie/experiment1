package com.example.demo.service

import com.example.demo.entity.Barn
import com.example.demo.entity.Horse
import com.example.demo.repository.BarnRepository
import com.example.demo.repository.HorseRepository
import org.springframework.stereotype.Service

@Service
class BarnService(
    private val barnRepository: BarnRepository,
    private val horseRepository: HorseRepository,
) {
    fun getAllBarns(): List<Barn> = barnRepository.findAll()

    fun createBarn(barn: Barn): Barn = barnRepository.save(barn)

    fun getBarnByBarnId(barnId: Long): Barn? = barnRepository.findBarnByBarnId(barnId).orElse(null)

    fun getAllHorsesByBarn(barnId: Long): List<Horse> {
        val barn = barnRepository.findBarnByBarnId(barnId).orElse(null) ?: return emptyList()
        return horseRepository.findAllByHomeBarn(barn)
    }

    fun updateBarn(
        barnId: Long,
        updatedBarn: Barn,
    ): Barn {
        val existingBarn =
            barnRepository.findBarnByBarnId(barnId).orElseThrow {
                throw RuntimeException("Barn not found")
            }

        val barnToUpdate =
            existingBarn.copy(
                barnName = updatedBarn.barnName,
                owner = updatedBarn.owner,
                size = updatedBarn.size,
                feedRoom = updatedBarn.feedRoom,
                tackRoom = updatedBarn.tackRoom,
                showerStall = updatedBarn.showerStall,
                indoorArena = updatedBarn.indoorArena,
                outdoorArena = updatedBarn.outdoorArena,
            )

        return barnRepository.save(barnToUpdate)
    }
}
