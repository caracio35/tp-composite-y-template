package unrn.modelo;

public class Spike implements ItemTrabajo {
    private double tiempo;

    public Spike(double tiempo) {
        this.tiempo = tiempo;
    }

    public double obtenerTiempoTotal() {
        return tiempo;
    }
}
