package edu.eci.arsw.AirportsTest.controllers;

import edu.eci.arsw.AirportsTest.services.AirpotFinderService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(value = "/airpotfinder")
public class AirportTestController {
    @Autowired
    @Qualifier("AFServicesImpl")
    AirpotFinderService afs;
    
    @RequestMapping(path = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<?> getAirpotsByName(@PathVariable(name = "name") String nombre) {
        try {
           
            return new ResponseEntity<>(afs.getAirpotsByName(nombre),HttpStatus.ACCEPTED);

        } catch (Exception ex) {
            return new ResponseEntity<>("400 bad request", HttpStatus.NOT_FOUND);
        }
    }
    
}