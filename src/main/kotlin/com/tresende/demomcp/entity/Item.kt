package com.tresende.demomcp.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant

@Entity
@Table
class Item(
    @Id
    var id: String?,
    var name: String?,
    var isActive: Boolean,
    var createdAt: Instant? = null,
    var updatedAt: Instant? = null,
) {
    constructor() : this(
        id = null,
        name = null,
        isActive = false,
        createdAt = null,
        updatedAt = null,
    ) {
    }
}