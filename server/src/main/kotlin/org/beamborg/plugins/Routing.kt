package org.beamborg.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import org.beamborg.routes.beamSessionRouting

fun Application.configureRouting() {
    routing {
        route("/api/v1") {
            beamSessionRouting()
        }
        get("/hello") {
            call.respondText("Hello World!")
        }
    }
}
