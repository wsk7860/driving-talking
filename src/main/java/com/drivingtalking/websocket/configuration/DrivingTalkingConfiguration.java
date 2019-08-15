package com.drivingtalking.websocket.configuration;

import com.drivingtalking.websocket.handler.DrivingTalkingHandler;
import com.drivingtalking.websocket.interceptors.DrivingTalkingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.HandshakeInterceptor;

@Configuration
@EnableWebSocket
public class DrivingTalkingConfiguration implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(DrivingTalkingHandler(), "/websocket").addInterceptors(DrivingTalkingInterceptor()).setAllowedOrigins("*");
    }

    @Bean
    public WebSocketHandler DrivingTalkingHandler() {
        return new DrivingTalkingHandler();
    }

    @Bean
    public HandshakeInterceptor DrivingTalkingInterceptor() {
        return new DrivingTalkingInterceptor();
    }


}
