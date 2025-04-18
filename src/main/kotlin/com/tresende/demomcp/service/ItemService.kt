package com.tresende.demomcp.service

import com.tresende.demomcp.entity.Item
import com.tresende.demomcp.repository.ItemRepository
import org.springframework.ai.tool.annotation.Tool
import org.springframework.stereotype.Service
import java.time.Instant
import java.util.*

@Service
class ItemService(
    private val itemRepository: ItemRepository
) {
    @Tool(name = "save", description = "Save an item")
    fun save(name: String) =
        itemRepository.save(
            Item(
                id = UUID.randomUUID().toString(),
                name,
                isActive = true,
                createdAt = Instant.now(),
                updatedAt = Instant.now()
            )
        )

    @Tool(name = "find_all", description = "Find all items")
    fun findAll() =
        itemRepository.findAll().toList()
}