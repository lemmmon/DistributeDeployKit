package com.manager.envManager.connect;

import com.manager.envManager.thread.ListenSouthPortHandlerThread;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class ListenSouthSocket extends ServerSocket {
    private ExecutorService executorService = Executors.newFixedThreadPool(20);

    public ListenSouthSocket(int port) throws IOException {
        super(port);
        log.info("init socket success, start listen {} ...", port);
        while (true) {
            Socket socket = accept();
            executorService.submit(new ListenSouthPortHandlerThread() {{
                init(socket);
            }});
        }
    }
}
