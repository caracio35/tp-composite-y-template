package tp6_3.Modelo;

public class Seguro implements Seguros {
    private double precio;

    public Seguro(double precio) {
        this.precio = precio;
    }

    public double obtenerPrecio() {
        return precio;
    }

}
