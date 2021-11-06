package com.manager.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class PortConfig {
    @Value("${spring.manager.port}")
    public int port;
}
