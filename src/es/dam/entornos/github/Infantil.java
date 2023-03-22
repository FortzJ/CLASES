package es.dam.entornos.github;

public class Infantil extends Visitante  {
    private double tarifa =6;

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public Infantil(String nombre, String apellido, double tarifa) {
        super(nombre, apellido, tarifa);
    }

    
    
}
