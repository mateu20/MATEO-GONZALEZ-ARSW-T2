package edu.eci.arsw.AirportsTest.services;

import java.io.IOException;

public interface ConexionService {
	/**
	 * 
	 * @param name nombre del aeropuerto a buscar
	 * @return el aeropuerto correspondiente
	 * @throws IOException si no se puede encontrar el aeropuerto
	 */
    public String airpotsByName(String name) throws IOException;

}
