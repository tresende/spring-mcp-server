package com.tresende.demomcp.service

import com.tresende.demomcp.entity.Item
import com.tresende.demomcp.repository.ItemRepository
import org.springframework.stereotype.Service
import java.time.Instant
import java.util.*

@Service
class ItemService(
    private val itemRepository: ItemRepository
) {
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

    fun findAll() =
        itemRepository.findAll().toList()
}