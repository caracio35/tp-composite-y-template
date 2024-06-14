package unrn.modelo;

public class Tarea implements ItemTrabajo {
    private double tiempo;

    public Tarea(double tiempo) {
        this.tiempo = tiempo;
    }

    public double obtenerTiempoTotal() {
        return tiempo;
    }

}
