package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) { //NOSONAR
		SpringApplication.run(DemoApplication.class, args); //NOSONAR
	} //NOSONAR

	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!"; //NOSONAR
  }
}
