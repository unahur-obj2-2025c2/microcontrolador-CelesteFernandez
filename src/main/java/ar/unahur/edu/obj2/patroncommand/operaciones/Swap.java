package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.Comand;
import ar.unahur.edu.obj2.patroncommand.Programable;

public class Swap extends Comand  {

    @Override
    protected void doExecute(Programable micro) {
        Integer acumA = micro.getAcumuladorA();
        Integer acumB = micro.getAcumuladorB();
        micro.setAcumuladorA(acumB);
        micro.setAcumuladorB(acumA);
    }


}
