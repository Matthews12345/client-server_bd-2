package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; // связывает bean-компоненты Servlet, Filter и ServletContextInitializer из контекста приложения с сервером
@SpringBootApplication
public class PerformanceManagerApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(PerformanceManagerApplication.class,args);
    }
}
