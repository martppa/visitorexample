package com.martppa.visitor.servers.websocket

import com.martppa.visitor.servers.WebSocketServer
import com.martppa.visitor.servers.rest.ApacheServer
import com.martppa.visitor.visitors.Visitor

open class ApacheWebSocketServer : WebSocketServer {

    override fun init() {
        // Whatever a server needs to start
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    fun wrap(apacheServer: ApacheServer) {
        println("Using apache server to power web socket")
    }
}