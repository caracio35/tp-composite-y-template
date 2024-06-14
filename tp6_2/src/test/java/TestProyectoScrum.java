
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

import unrn.modelo.HistorialUsuario;
import unrn.modelo.Proyecto;
import unrn.modelo.Spike;
import unrn.modelo.Tarea;

public class TestProyectoScrum {

    @Test
    public void testCasocompleto() {
        Proyecto proyecto = new Proyecto(0);
        HistorialUsuario historialUsuario = new HistorialUsuario(0);
        HistorialUsuario historialUsuario2 = new HistorialUsuario(0);
        Tarea tarea = new Tarea(2);
        Tarea tarea2 = new Tarea(1);
        Spike spike = new Spike(4);
        historialUsuario.agregarSubTrabajo(tarea);
        historialUsuario2.agregarSubTrabajo(tarea2);
        proyecto.agregarSubTrabajo(historialUsuario);
        proyecto.agregarSubTrabajo(historialUsuario2);
        proyecto.agregarSubTrabajo(spike);
        System.out.println(proyecto.obtenerTiempoTotal());
        assertTrue(proyecto.obtenerTiempoTotal() == 7);
    }

    @Test
    public void testCasoParcial() {

        HistorialUsuario historialUsuario = new HistorialUsuario(4);
        Tarea tarea = new Tarea(2);
        Tarea tarea2 = new Tarea(1);
        Spike spike = new Spike(4);
        historialUsuario.agregarSubTrabajo(tarea);
        historialUsuario.agregarSubTrabajo(tarea2);
        historialUsuario.agregarSubTrabajo(spike);

        System.out.println(historialUsuario.obtenerTiempoTotal());
        assertTrue(historialUsuario.obtenerTiempoTotal() == 11);
    }
}