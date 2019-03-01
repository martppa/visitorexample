package com.martppa.visitor.servers.websocket

import com.martppa.visitor.servers.WebSocketServer
import com.martppa.visitor.servers.rest.NginxServer
import com.martppa.visitor.visitors.Visitor


open class NginxWebSocketServer : WebSocketServer {

    override fun init() {
        // Whatever a server needs to start
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    fun wrap(nginxServer: NginxServer) {
        println("Using nginx server to power web socket")
    }
}