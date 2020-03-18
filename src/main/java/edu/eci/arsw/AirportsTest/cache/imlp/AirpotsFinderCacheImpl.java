package edu.eci.arsw.AirportsTest.cache.imlp;
import edu.eci.arsw.AirportsTest.cache.AirportsFinderCache;
import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service("AFCacheImpl")
public class AirpotsFinderCacheImpl implements AirportsFinderCache{

    HashMap<String,String> airpotsbyname = new  HashMap<String,String>();
    HashMap<String,Long> airpotstime = new  HashMap<String,Long>();
    
    public void save(String name, String json) {
        airpotsbyname.put(name, json);
        airpotstime.put(name,System.currentTimeMillis());
    }

    @Override
    public boolean isSave(String name) {
        return airpotsbyname.containsKey(name);
    }

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
