package unrn;

public class EmpleadoRegular implements IntEmpleado {
    private double salario;

    public EmpleadoRegular(double salario) {
        this.salario = salario;
    }

    public double getSalarioTotal() {
        return salario;
    }
}
