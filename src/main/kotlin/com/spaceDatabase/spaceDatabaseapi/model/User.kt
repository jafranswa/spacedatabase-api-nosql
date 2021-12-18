package com.spaceDatabase.spaceDatabaseapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class User {
    @Id
    var id=""
    var name=""
    var email=""
}