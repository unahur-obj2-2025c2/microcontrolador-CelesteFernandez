package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.Comand;
import ar.unahur.edu.obj2.patroncommand.Programable;

public class Lod extends Comand {

    private Integer addr;

    public Lod(Integer addr) {
        this.addr = addr;
    }

    @Override
    protected void doExecute(Programable micro) {
        Integer dato = micro.getAddr(this.addr);
        micro.setAcumuladorA(dato);
    }

}
