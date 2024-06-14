package tp6_4.modelo;

public class CalculadoraJubilado extends CalculadorGral {

    public CalculadoraJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected double calcularIva(double precioProducto) {
        if (!esMesEnPromocion()) {
            return precioProducto * 0.1;
        }
        return 0;
    }

}
