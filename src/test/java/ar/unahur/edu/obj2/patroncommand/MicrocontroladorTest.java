package ar.unahur.edu.obj2.patroncommand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unahur.edu.obj2.patroncommand.operaciones.Add;
import ar.unahur.edu.obj2.patroncommand.operaciones.Lodv;
import ar.unahur.edu.obj2.patroncommand.operaciones.Nop;
import ar.unahur.edu.obj2.patroncommand.operaciones.Swap;

public class MicrocontroladorTest {

    Microcontrolador micro = new Microcontrolador();

    @BeforeEach
    public void init(){
        micro.reset();
    }

    @Test
    void hacerAvanzar3PosicionesElProgramCounter() {
        Operable nop1 = new Nop();
        Operable nop2 = new Nop();
        Operable nop3 = new Nop();
        List<Operable> operaciones = List.of(nop1, nop2, nop3);

        micro.run(operaciones);
        assertEquals(3, micro.getProgramCounter());
    }

    @Test
    void sumar20Mas17(){
        Operable lodv20 = new Lodv(20);
        Operable swap = new Swap();
        Operable lodv17 = new Lodv(17);
        Operable add = new Add();

        List<Operable> operaciones = List.of(lodv20, swap, lodv17, add);
        micro.run(operaciones);

        assertEquals(37, micro.getAcumuladorA());
        assertEquals(0, micro.getAcumuladorB());
        assertEquals(4, micro.getProgramCounter());
    }
}
