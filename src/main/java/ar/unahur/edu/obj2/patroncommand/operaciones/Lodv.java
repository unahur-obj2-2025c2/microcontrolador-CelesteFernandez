package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.Comand;
import ar.unahur.edu.obj2.patroncommand.Programable;

public class Lodv extends Comand {
    Integer val;

    public Lodv(Integer val) {
        this.val = val;
    }

    @Override
    protected void doExecute(Programable micro) {
        micro.setAcumuladorA(this.val);
    }

}
