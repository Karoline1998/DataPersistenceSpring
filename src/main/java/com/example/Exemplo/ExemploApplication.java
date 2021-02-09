package com.example.Exemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Exemplo.service.TimesService;

@SpringBootApplication
public class ExemploApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ExemploApplication.class, args);

        TimesService timesService = (TimesService) ctx.getBean("timesService");
        timesService.saveTime();
    }
}