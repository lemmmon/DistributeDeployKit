package com.controller;

import com.bean.service.Host;
import com.bean.system.Result;
import com.service.DeployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/deploy")
public class DeployController {
    @Autowired
    private DeployService deployService;

    @RequestMapping(value = "/task", method = RequestMethod.POST)
    public Result deploy(List<Host> hostList) {
        deployService.postDeploy();
        // todo 增加对异常的处理
        return new Result();
    }

    @RequestMapping(value = "/task", method = RequestMethod.GET)
    public Result deploy() {

    }
}
