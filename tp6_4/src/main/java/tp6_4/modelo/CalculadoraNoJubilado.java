package tp6_4.modelo;

public class CalculadoraNoJubilado extends CalculadorGral {

    public CalculadoraNoJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
        // TODO Auto-generated constructor stub
    }

    @Override

    protected double calcularIva(double precioProducto) {
        if (esMesEnPromocion()) {
            return precioProducto * 0.15;
        } else {
            return precioProducto * 0.21;

        }
    }

}
