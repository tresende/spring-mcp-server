package com.tresende.demomcp

import com.tresende.demomcp.controller.ItemController
import org.springframework.ai.tool.method.MethodToolCallbackProvider
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

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