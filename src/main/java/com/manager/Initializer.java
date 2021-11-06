package com.manager;

import com.manager.config.PortConfig;
import com.manager.envManager.connect.ListenSouthSocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Initializer implements CommandLineRunner {
    @Autowired
    private PortConfig portConfig;

    @Override
    public void run(String... args) {
        try {
            new ListenSouthSocket(portConfig.getPort());
        } catch (Exception ex) {
            log.error("init failed: ", ex);
        }
    }
}
