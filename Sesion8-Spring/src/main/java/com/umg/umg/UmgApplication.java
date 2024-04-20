package com.umg.umg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class UmgApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmgApplication.class, args);
	}

}
