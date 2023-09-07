package com.spaceDatabase.spaceDatabaseapi.repository

import com.spaceDatabase.spaceDatabaseapi.model.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: MongoRepository<User, String> {
}