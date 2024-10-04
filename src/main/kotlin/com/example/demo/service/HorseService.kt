package com.example.demo.service

import com.example.demo.entity.Horse
import com.example.demo.repository.HorseRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class HorseService(
    private val horseRepository: HorseRepository
) {
    fun getAllHorses(): List<Horse> {
        return horseRepository.findAll()
    }

}
//
//class UserService(private val userRepository: UserRepository) {
//
//    fun getAllUsers(): List<User> = userRepository.findAll()
//
//    fun getUserById(id: Long): User? = userRepository.findById(id).orElse(null)
//
//    fun createUser(user: User): User = userRepository.save(user)
//
//    fun deleteUser(id: Long) = userRepository.deleteById(id)
//}

//    fun getOrganization(organizationKey: String) = organizationClient.getById(organizationKey)
//
//    fun deactivatePro(
//        organizationKey: String,
//        request: ProDeactivationRequest,
//    ) {
//        val accountGlobalKey = getOrganization(organizationKey).globalKey()
//
//        subscriptionService.deactivateSubscription(accountGlobalKey, request)
//
//        billingStatusService.deactivateProBillingStatus(organizationKey, request)
//    }
//
//    fun updateContactInfo(
//        accountGlobalKey: String,
//        request: ProContactInfoUpdateRequest,
//    ) {
//        try {
//            val response =
//                netsuiteServiceClient.updateProContactInfo(
//                    accountGlobalKey,
//                    request.toNetSuiteContactUpdateRequest(),
//                )
//
//            if (response.isSuccess()) {
//                logger.info("Updated contact info for pro billing profile")
//            } else {
//                handleUpdateContactInfoError(
//                    "NetSuite error: ${response.errorMessage() ?: "unknown"}",
//                )
//            }
//        } catch (ex: FeignException) {
//            handleUpdateContactInfoError("Feign exception: ${ex.message}")
//        }
//    }
//
//    fun getProBillingStatusResponse(
//        organizationKey: String,
//        programKey: String,
//    ): ProBillingStatusResponse {
//        val globalKey = getOrganization(organizationKey).globalKey()
//
//        val billingStatuses =
//            try {
//                billingStatusService.getOrCreateProBillingStatus(organizationKey, globalKey, programKey)
//            } catch (ex: DataIntegrityViolationException) {
//                // If creation violates the DB unique constraint, select the already existing record(s)
//                billingStatusService.getProBillingStatus(organizationKey, programKey)
//            }
//
//        return billingStatuses.toProBillingStatusResponse()
//    }
//
//    private fun handleUpdateContactInfoError(context: String) {
//        logger.error("Could not update contact info for pro billing profile - $context")
//
//        throw IllegalArgumentException("Failed to update contact info for pro billing profile")
//    }
//}
