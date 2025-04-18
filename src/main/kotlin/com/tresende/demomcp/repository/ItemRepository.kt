package com.tresende.demomcp.repository

import com.tresende.demomcp.entity.Item
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepository : CrudRepository<Item, String> {
}