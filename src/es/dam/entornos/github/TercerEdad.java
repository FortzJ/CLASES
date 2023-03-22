package es.dam.entornos.github;

public class TercerEdad extends Visitante {
    private double tarifa=5;

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public TercerEdad(String nombre, String apellido, double tarifa) {
        super(nombre, apellido, tarifa);
    }

    
}
