package edu.eci.arsw.AirportsTestAPI;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirportsTestApiApplication {
	
	/**
	 * Funcion principal en la que se inyecta la clase AirportFinder
	 * @param args Es la lista de parametros recibida
	 */
	public static void main(String[] args) {
		SpringApplication.run(AirportsTestApiApplication.class, args);
	}

}