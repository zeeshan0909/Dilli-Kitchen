package com.swadsutra.dilliKitchen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DilliKitchenApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DilliKitchenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("working fine, can continue");

	}
}
