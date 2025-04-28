package com.tresende.demomcp.controller

import com.tresende.demomcp.service.ItemService
import org.springframework.ai.tool.annotation.Tool
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ItemController(private val itemService: ItemService) {
    @PostMapping
    @Tool(name = "save", description = "Save a product with a name")
    fun save(string: String) =
        itemService.save(string)

    @Tool(name = "find_all", description = "Find all products")
    @GetMapping("/items")
    fun findAll() =
        itemService.findAll()
}