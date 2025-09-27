package com.gamestriker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Slf4j
@SpringBootApplication
public class GameStrikerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameStrikerApplication.class, args);
    }

    @EventListener
    public void getContextRefreshedEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ApplicationContext applicationContext = contextRefreshedEvent.getApplicationContext();
        var handlerMapping = applicationContext.getBean("requestMappingHandlerMapping",
                RequestMappingHandlerMapping.class);
        handlerMapping.getHandlerMethods().forEach((key, value) -> log.info(String.valueOf(key)));
    }

}
