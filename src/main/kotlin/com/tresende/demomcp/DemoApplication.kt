package com.tresende.demomcp

import org.springframework.ai.tool.annotation.Tool
import org.springframework.ai.tool.method.MethodToolCallbackProvider
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

@SpringBootApplication
class DemoApplication {
    @Bean
    fun toolCallbackProvider(itemController: ItemController) =
        MethodToolCallbackProvider.builder()
            .toolObjects(itemController)
            .build()
}

@RestController
class ItemController {

    private val items = mutableListOf<String>()

    @PostMapping
    @Tool(name = "save", description = "Save a product with a name")
    fun save(productName: String) =
        items.add(productName)

    @Tool(name = "find_all", description = "Find all products")
    @GetMapping("/items")
    fun findAll() =
        items
}