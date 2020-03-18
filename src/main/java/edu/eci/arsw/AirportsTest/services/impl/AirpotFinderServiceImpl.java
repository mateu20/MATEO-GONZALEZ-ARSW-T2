
package edu.eci.arsw.AirportsTest.services.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.eci.arsw.AirportsTest.cache.AirportsFinderCache;
import edu.eci.arsw.AirportsTest.services.AirpotFinderService;
import edu.eci.arsw.AirportsTest.services.ConexionService;

@Service("AFServicesImpl")
public class AirpotFinderServiceImpl implements AirpotFinderService{
    
    @Autowired
    @Qualifier("HCServicesImpl")
    ConexionService hcs;
    
    @Autowired
    @Qualifier("AFCacheImpl")
    AirportsFinderCache afc;
    
    @Override
    public String getAirpotsByName(String name) throws IOException{
        if(!afc.isSave(name)){
            afc.save(name, hcs.airpotsByName(name));
        }
        
        return afc.load(name);
        
    }
    
}