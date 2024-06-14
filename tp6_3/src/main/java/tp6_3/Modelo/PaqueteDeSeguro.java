package tp6_3.Modelo;

import java.util.ArrayList;
import java.util.List;

public class PaqueteDeSeguro implements Seguros {
    private double precio;
    List<Seguros> subSeguros;

    public PaqueteDeSeguro(double precio) {
        this.precio = precio;
        subSeguros = new ArrayList<>();
    }

    public void agregarSubSeguro(Seguros subSeguro) {
        subSeguros.add(subSeguro);
    }

    public double obtenerPrecio() {
        double precioTotal = precio;
        for (Seguros subSeguro : subSeguros) {
            precioTotal += subSeguro.obtenerPrecio();
        }
        return precioTotal;
    }

}
