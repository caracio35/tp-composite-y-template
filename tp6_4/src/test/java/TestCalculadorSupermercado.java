import static org.junit.Assert.assertTrue;

import static java.time.LocalDate.now;

import org.junit.Test;

import tp6_4.modelo.CalculadorGral;
import tp6_4.modelo.CalculadoraJubilado;
import tp6_4.modelo.CalculadoraNoJubilado;

public class TestCalculadorSupermercado {
    @Test
    public void testCalculadorSupermercado() {
        int mesEnPromocion = now().plusMonths(2).getMonthValue();
        CalculadorGral jubilado = new CalculadoraJubilado(mesEnPromocion);
        double precioProductos = 100;
        precioProductos += 200;
        precioProductos += 300;
        precioProductos += 400;
        precioProductos += 500;
        // calculamos el precio total con el IVA sin promocion
        double precioTotal = jubilado.calcularPrecio(precioProductos);
        assertTrue(precioTotal == 1650);

        System.out.println(mesEnPromocion);
        System.out.println(precioTotal);
        mesEnPromocion = now().getMonthValue();
        // calculamos el precio total sin IVA
        jubilado = new CalculadoraJubilado(now().getMonthValue());
        precioTotal = jubilado.calcularPrecio(precioProductos);
        System.out.println(mesEnPromocion);
        System.out.println(precioTotal);
        assertTrue(precioTotal == 1500);
    }

    @Test
    public void testCalculadorSupermercadoNoJubilado() {
        int mesEnPromocion = now().getMonthValue();
        CalculadorGral noJubilado = new CalculadoraNoJubilado(mesEnPromocion);
        double precioProductos = 100;
        precioProductos += 200;
        precioProductos += 300;
        precioProductos += 400;
        precioProductos += 500;
        // calculamos el precio total IVA en promocion
        double precioTotal = noJubilado.calcularPrecio(precioProductos);

        assertTrue(precioTotal == 1725);
        mesEnPromocion = now().plusMonths(2).getMonthValue();
        noJubilado = new CalculadoraNoJubilado(mesEnPromocion);
        precioTotal = noJubilado.calcularPrecio(precioProductos);

        // calculamos el precio total IVA sin promocion
        assertTrue(precioTotal == 1815);
    }

}
