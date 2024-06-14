package tp6_4.modelo;

import static java.time.Month.of;
import static java.time.LocalDate.now;

public abstract class CalculadorGral implements Calculador {

    private int mesEnPromocion;

    public CalculadorGral(int mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
    }

    @Override
    public double calcularPrecio(double precioProducto) {

        double precioTotal = precioProducto + calcularIva(precioProducto);

        return precioTotal;

    }

    protected abstract double calcularIva(double precioProducto);

    protected boolean esMesEnPromocion() {
        return of(mesEnPromocion).equals(now().getMonth());
    }
}
