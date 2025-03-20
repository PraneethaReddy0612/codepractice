package com.example.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MyAppApplication.class, args);
		Alien a = run.getBean(Alien.class);
		a.build();
	}

}
