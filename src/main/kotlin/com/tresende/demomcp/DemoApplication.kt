package com.tresende.demomcp

import com.tresende.demomcp.service.ItemService
import org.springframework.ai.tool.ToolCallbacks
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

@Bean
fun getTools(
    itemService: ItemService
) = ToolCallbacks.from(itemService).asList()
