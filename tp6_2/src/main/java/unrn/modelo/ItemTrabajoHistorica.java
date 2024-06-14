package unrn.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class ItemTrabajoHistorica implements ItemTrabajo {
    private double tiempo;
    private List<ItemTrabajo> trabajos;

    public ItemTrabajoHistorica(double tiempo) {
        this.tiempo = tiempo;
        trabajos = new ArrayList<>();
    }

    public void agregarSubTrabajo(ItemTrabajo subTrabajo) {
        trabajos.add(subTrabajo);
    }

    public double obtenerTiempoTotal() {
        double total = tiempo;
        for (ItemTrabajo subTrabajo : trabajos) {
            total += subTrabajo.obtenerTiempoTotal();
        }
        return total;
    }

}
