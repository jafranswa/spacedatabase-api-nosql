package com.spaceDatabase.spaceDatabaseapi.service

import com.spaceDatabase.spaceDatabaseapi.model.User
import com.spaceDatabase.spaceDatabaseapi.repository.UserRepository
import java.util.*

class UserService(private val userRepository: UserRepository) {

    fun getUsers() : List<User> {
        return userRepository.findAll()
    }

    fun getUser(id: String): User? {
        return userRepository.findById(id).orElse(null)
    }

    fun create(user: User): User? {
        return userRepository.save(user)
    }

    fun update(user: User): User? {
        return userRepository.save(user)
    }

    fun deleteById(id: String): String? {
        userRepository.deleteById(id)
        return id
    }

}