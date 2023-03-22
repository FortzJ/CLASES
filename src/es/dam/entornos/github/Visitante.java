package es.dam.entornos.github;

public class Visitante {
    private String nombre; 
    private String apellido; 
    private double tarifa=10;

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getTarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }


    public Visitante(String nombre, String apellido, double tarifa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarifa = tarifa;
    } 
    
}
