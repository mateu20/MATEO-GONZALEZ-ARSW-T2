package edu.eci.arsw.AirportsTest.services;

import java.io.IOException;

public interface AirpotFinderService {
	/**
	 * 
	 * @param name nombre del aeropuerto a buscar
	 * @return el aeropuerto correspondiente
	 * @throws IOException si no se puede encontrar el aeropuerto
	 */
    public String getAirpotsByName(String name) throws IOException;
}