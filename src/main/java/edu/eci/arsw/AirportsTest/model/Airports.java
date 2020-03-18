package edu.eci.arsw.AirportsTest.model;

public class Airports {
	private String ciudad;
	private String nombre;
    private String codigoPais;
    private String codigo;   
    
    public Airports(){        
    }
    public String getcodigo() {
        return this.codigo;
    }
    public void setcodigo(String codigo){
        this.codigo=codigo;
    }
    public String getnombre() {
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getciudad() {
        return this.ciudad;
    }
    public void setciudad(String ciudad){
        this.ciudad=ciudad;
    }
    public String getcodigoPais() {
        return this.codigoPais;
    }
    public void setcodigoPais(String codigoPais){
        this.codigoPais=codigoPais;
    }
    
    
    
    
   
}