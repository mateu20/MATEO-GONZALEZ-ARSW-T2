package edu.eci.arsw.AirportsTest.services;

import java.io.IOException;

public interface AirpotFinderService {
    public String getAirpotsByName(String name) throws IOException;
}