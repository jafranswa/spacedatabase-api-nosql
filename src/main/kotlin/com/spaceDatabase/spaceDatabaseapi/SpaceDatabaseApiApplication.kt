package com.spaceDatabase.spaceDatabaseapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2


@SpringBootApplication
@EnableSwagger2
class SpaceDatabaseApiApplication

fun main(args: Array<String>) {
	runApplication<SpaceDatabaseApiApplication>(*args)
}
