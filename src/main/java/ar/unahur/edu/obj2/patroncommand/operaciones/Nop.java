package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.Comand;
import ar.unahur.edu.obj2.patroncommand.Programable;

public class Nop extends Comand {

    @Override
    protected void doExecute(Programable micro) {
        // No hace nada
    }
}
