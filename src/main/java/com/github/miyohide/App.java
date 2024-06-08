package com.github.miyohide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @Bean
  public Function<String, String> reverseString() {
    return value -> new StringBuilder(value).reverse().toString();
  }
}
