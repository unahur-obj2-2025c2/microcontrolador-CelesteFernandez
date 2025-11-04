package ar.unahur.edu.obj2.patroncommand;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    private List<Operable> operaciones = new ArrayList<>();

    public void run(Programable micro) {
        micro.run(operaciones);
    }

    public void agregarOperacion(Operable operacion) {
        operaciones.add(operacion);
    }

    public void vaciarLista() {
        operaciones.clear();
    }
}
