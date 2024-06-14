package unrn;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCompuesto implements IntEmpleado {
    private double salario;
    private List<IntEmpleado> subordinados;

    public EmpleadoCompuesto(double salario) {
        this.salario = salario;
        this.subordinados = new ArrayList<>();

    }

    private double getSalario() {
        return salario;
    }

    public void agregarSubordinado(IntEmpleado subordinado) {
        subordinados.add(subordinado);
    }

    public double getSalarioTotal() {
        double salarioTotal = salario;
        for (IntEmpleado subordinado : subordinados) {
            salarioTotal += subordinado.getSalarioTotal();
        }
        return salarioTotal;
    }

}
