package com.jetbrains.handson.httpapi

import io.ktor.serialization.kotlinx.json.*       // json()
import io.ktor.server.application.*               // fun Application
import io.ktor.server.plugins.contentnegotiation.*  // ContentNegotiation
//import io.ktor.server.routing.*                     // routing { }
import com.jetbrains.handson.httpapi.routes.registerCustomerRoutes
import com.jetbrains.handson.httpapi.routes.registerOrderRoutes


fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation) {
        json()
    }
    registerCustomerRoutes()
    registerOrderRoutes()
}
