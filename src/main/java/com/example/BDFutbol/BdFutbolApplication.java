package com.example.BDFutbol;

import org.springframework.boot.SpringApplication;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BdFutbolApplication {

	public static void main(String[] args) {
		loadEnv();
		SpringApplication.run(BdFutbolApplication.class, args);


	}

	public static void loadEnv(){
		Dotenv dotenv = Dotenv.load();
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));

	}


}
