package com.controller;

import com.bean.service.Host;
import com.bean.system.Result;
import com.sun.istack.internal.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cmd")
public class CmdController {
    @RequestMapping(value = "/batch_send_send", method = RequestMethod.POST)
    public Result sendCmd(@NotNull String cmd, List<Host> hosts) {
        // todo 发送单条命令
        return new Result();
    }
}
