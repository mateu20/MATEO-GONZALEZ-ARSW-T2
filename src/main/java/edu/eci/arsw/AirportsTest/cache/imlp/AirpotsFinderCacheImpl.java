package edu.eci.arsw.AirportsTest.cache.imlp;
import edu.eci.arsw.AirportsTest.cache.AirportsFinderCache;
import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service("AFCacheImpl")
public class AirpotsFinderCacheImpl implements AirportsFinderCache{

    HashMap<String,String> airpotsbyname = new  HashMap<String,String>();
    HashMap<String,Long> airpotstime = new  HashMap<String,Long>();
    /**
     * Metodo que guarda el aeropuerto en un onejto json
     */
    public void save(String name, String json) {
        airpotsbyname.put(name, json);
        airpotstime.put(name,System.currentTimeMillis());
    }
    /**
     * Metodo que duvuelve un valor booleano si el aeropuerto fue guardado exitosamente
     */
    @Override
    
    public boolean isSave(String name) {
        return airpotsbyname.containsKey(name);
    }
    /**
     * Metodo que determina si pasaron mas de los 5 minutos para almacenar en el cache
     */
    
    @Override    
    public String load(String name) {
        String airpots = airpotsbyname.get(name);        
        long timeLoad =( System.currentTimeMillis()-airpotstime.get(name))/1000;        
        if (timeLoad>300){
            airpotsbyname.remove(name);
            airpotstime.remove(name);
        }
        
        return airpots;
         
    }
    
}
