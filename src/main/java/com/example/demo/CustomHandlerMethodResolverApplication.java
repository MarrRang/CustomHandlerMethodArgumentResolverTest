package com.example.demo;

import com.example.demo.resolver.CustomHandlerResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@SpringBootApplication
public class CustomHandlerMethodResolverApplication extends WebMvcConfigurationSupport {
    private final CustomHandlerResolver customHandlerResolver;

    @Autowired
    public CustomHandlerMethodResolverApplication(CustomHandlerResolver customHandlerResolver) {
        this.customHandlerResolver = customHandlerResolver;
    }

    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolverList) {
        super.addArgumentResolvers(argumentResolverList);
        argumentResolverList.add(customHandlerResolver);
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomHandlerMethodResolverApplication.class, args);
    }

}
