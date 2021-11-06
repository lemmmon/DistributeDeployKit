package com.manager.envManager.thread;

import lombok.extern.slf4j.Slf4j;

import java.net.Socket;

@Slf4j
public class ListenSouthPortHandlerThread implements Runnable {
    private Socket socket;

    public void init(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        log.info("get a request");
    }
}
