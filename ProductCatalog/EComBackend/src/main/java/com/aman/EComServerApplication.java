package com.aman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EComServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EComServerApplication.class, args);
		System.out.println( "Started!" );
	}

}
