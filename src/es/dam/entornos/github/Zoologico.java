package es.dam.entornos.github;
/**
 * La clase principal
 * @author Joel Forteza
 */
public class Zoologico {
    private String localidad; 
    private int plazas;


    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public int getPlazas() {
        return plazas;
    }
    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }


    public Zoologico(String localidad, int plazas) {
        this.localidad = localidad;
        this.plazas = plazas;
    }
    
}
