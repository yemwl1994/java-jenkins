package com.andy.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.andy.info")
public class InfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfoApplication.class, args);
	}

}
