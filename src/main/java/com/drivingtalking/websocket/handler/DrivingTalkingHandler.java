package com.drivingtalking.websocket.handler;


import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class DrivingTalkingHandler extends TextWebSocketHandler{

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        session.sendMessage(new TextMessage("服务器返回收到的信息," + payload));

    }






}
