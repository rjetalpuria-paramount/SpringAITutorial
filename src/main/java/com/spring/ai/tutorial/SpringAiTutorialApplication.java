package com.spring.ai.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringAiTutorialApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringAiTutorialApplication.class, args);
  }
}
