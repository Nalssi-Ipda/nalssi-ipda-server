package com.ipda

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IpdaServerApplication

fun main(args: Array<String>) {
	runApplication<IpdaServerApplication>(*args)
}
