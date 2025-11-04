package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.Comand;
import ar.unahur.edu.obj2.patroncommand.Programable;

public class Str extends Comand {
    private Integer addr;

    public Str(Integer addr) {
        this.addr = addr;
    }

    @Override
    protected void doExecute(Programable micro) {
        Integer dato = micro.getAcumuladorA();
        micro.setAddr(this.addr);
    }
}
