package com.spaceDatabase.spaceDatabaseapi.controller

import com.spaceDatabase.spaceDatabaseapi.model.User
import com.spaceDatabase.spaceDatabaseapi.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping("/")
    fun getUsers() : ResponseEntity<List<User>> {
        return ResponseEntity.ok(userService.getUsers())
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: String) : ResponseEntity<User> {
        return ResponseEntity.ok(userService.getUser(id))
    }

    @PostMapping("/")
    fun createUser(@RequestBody user: User) : ResponseEntity<User> {
        return ResponseEntity.ok(userService.create(user))
    }

    @PutMapping("/{id}")
    fun updateUser(@PathVariable id: String, @RequestBody user: User) : ResponseEntity<User> {
        var oldUser = userService.getUser(id)
        if (oldUser != null) {
            oldUser.email = user.email
            oldUser.name = user.name
            return ResponseEntity.ok(userService.update(oldUser))
        }
        return ResponseEntity.notFound().build()
    }

    @DeleteMapping("/{id}")
    fun deleteUseById(@PathVariable id: String, @RequestBody user: User): ResponseEntity<String> {
        var oldUser = userService.getUser(id)
        if (oldUser != null) {
            return ResponseEntity.ok(userService.deleteById(id))
        }
        return ResponseEntity.notFound().build()
    }
}