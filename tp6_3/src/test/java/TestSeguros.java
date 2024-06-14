import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import tp6_3.Modelo.PaqueteDeSeguro;
import tp6_3.Modelo.Seguro;
import tp6_3.Modelo.SeguroAutomovil;
import tp6_3.Modelo.SeguroHogar;
import tp6_3.Modelo.SeguroMedico;
import tp6_3.Modelo.SeguroVida;

public class TestSeguros {

    @Test
    public void testSeguro() {
        PaqueteDeSeguro paqueteDeSeguro = new PaqueteDeSeguro(0);
        Seguro sHogar = new SeguroHogar(800);
        Seguro sAutomovil = new SeguroAutomovil(300);
        Seguro sVida = new SeguroVida(100);
        Seguro sMedico = new SeguroMedico(100);
        paqueteDeSeguro.agregarSubSeguro(sHogar);
        paqueteDeSeguro.agregarSubSeguro(sAutomovil);
        paqueteDeSeguro.agregarSubSeguro(sVida);
        paqueteDeSeguro.agregarSubSeguro(sMedico);
        assertTrue(paqueteDeSeguro.obtenerPrecio() == 1300);
    }

    @Test
    public void testSeguroConbinandoPaquetes() {
        PaqueteDeSeguro paqueteSeguroConvinado = new PaqueteDeSeguro(0);
        PaqueteDeSeguro paqueteSAutoYCasa = new PaqueteDeSeguro(0);
        Seguro sHogar = new SeguroHogar(800);
        Seguro sAutomovil = new SeguroAutomovil(300);
        PaqueteDeSeguro paquetePersonal = new PaqueteDeSeguro(0);
        Seguro sVida = new SeguroVida(200);
        Seguro sMedico = new SeguroMedico(100);
        paqueteSAutoYCasa.agregarSubSeguro(sHogar);
        paqueteSAutoYCasa.agregarSubSeguro(sAutomovil);
        paquetePersonal.agregarSubSeguro(sVida);
        paquetePersonal.agregarSubSeguro(sMedico);
        paqueteSeguroConvinado.agregarSubSeguro(paqueteSAutoYCasa);
        paqueteSeguroConvinado.agregarSubSeguro(paquetePersonal);
        assertTrue(paqueteSAutoYCasa.obtenerPrecio() == 1100);
        assertTrue(paquetePersonal.obtenerPrecio() == 300);
        assertTrue(paqueteSeguroConvinado.obtenerPrecio() == 1400);

    }
}
