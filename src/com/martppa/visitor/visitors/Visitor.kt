package com.martppa.visitor.visitors

import com.martppa.visitor.servers.websocket.ApacheWebSocketServer
import com.martppa.visitor.servers.websocket.ExpressWebSocketServer
import com.martppa.visitor.servers.websocket.NginxWebSocketServer

open interface Visitor {
    fun visit(apacheWebSocketServer: ApacheWebSocketServer)
    fun visit(expressWebSocketServer: ExpressWebSocketServer)
    fun visit(nginxWebSocketServer: NginxWebSocketServer)
}