package com.yiyi.example.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 服务生命周期监控
 */
@Slf4j
@Component
public class ServerLifeNotify  implements SmartLifecycle {

    private final AtomicBoolean running = new AtomicBoolean(false);

    @Override
    public void start() {
        log.info("yiyi-example server start finish");
        running.set(true);
    }

    @Override
    public void stop() {
        log.info("yiyi-example server top finish");
    }

    @Override
    public boolean isRunning() {
        return this.running.get();
    }

}
