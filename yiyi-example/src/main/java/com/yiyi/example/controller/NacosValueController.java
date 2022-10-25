package com.yiyi.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nacos")
public class NacosValueController {

    @Value(value = "${gray.enable:false}")
    private boolean grayEnable;

    @Value(value = "${log.level:info}")
    private String logLevel;

    @Value(value = "${rocket-mq.ip:1.1.1.138}")
    private String rocketMqIp;

    @GetMapping("/value")
    public String nacosValue(){
        return new StringBuilder()
                .append("gray.enable").append("=").append(grayEnable).append("\n")
                .append("log.level").append("=").append(logLevel).append("\n")
                .append("rocket-mq").append("=").append(rocketMqIp).append("\n")
                .toString();

    }
}
