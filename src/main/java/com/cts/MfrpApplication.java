package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.cts")
public class MfrpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MfrpApplication.class, args);
	}

}
