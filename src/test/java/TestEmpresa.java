
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import unrn.Director;
import unrn.EmpleadoRegular;
import unrn.Gerente;
import unrn.LiderDeProyecto;
import unrn.MandoMedio;

public class TestEmpresa {

    @Test
    public void testEmpresa() {
        var director = new Director(100000);
        var gerente = new Gerente(80000);
        var gerente2 = new Gerente(80000);
        var mandoMedio = new MandoMedio(60000);
        var mandoMedio2 = new MandoMedio(60000);
        var liderProyecto = new LiderDeProyecto(40000);
        var liderProyecto2 = new LiderDeProyecto(40000);
        var EmpleadoRegular = new EmpleadoRegular(30000);
        var EmpleadoRegular2 = new EmpleadoRegular(30000);

        director.agregarSubordinado(gerente);
        director.agregarSubordinado(gerente2);
        gerente.agregarSubordinado(mandoMedio);
        gerente2.agregarSubordinado(mandoMedio2);
        mandoMedio.agregarSubordinado(liderProyecto);
        mandoMedio2.agregarSubordinado(liderProyecto2);
        liderProyecto.agregarSubordinado(EmpleadoRegular);
        liderProyecto2.agregarSubordinado(EmpleadoRegular2);

        double salarioTotalPrueva = 520000.0;
        System.out.println(director.getSalarioTotal());
        assertEquals(salarioTotalPrueva, director.getSalarioTotal());
        assertNotEquals(salarioTotalPrueva += 10000, director.getSalarioTotal());

    }
}
