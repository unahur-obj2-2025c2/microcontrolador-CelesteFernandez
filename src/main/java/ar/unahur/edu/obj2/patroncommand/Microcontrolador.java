package ar.unahur.edu.obj2.patroncommand;

import java.util.Arrays;
import java.util.List;

public class Microcontrolador implements Programable {
    private Integer acumuladorA = 0;
    private Integer acumuladorB = 0;
    private Integer programCounter = 0;
    private List<Integer> memoria = Arrays.asList(new Integer[1024]);

    //constructor
    public Microcontrolador() {
    }

    @Override
    public void run(List<Operable> operaciones) {
        operaciones.forEach(o -> o.execute(this));
    }

    @Override
    public void incProgramCounter() {
        this.programCounter += 1;
    }

    @Override
    public Integer getProgramCounter() {
        return this.programCounter;
    }

    @Override
    public void setAcumuladorA(Integer value) {
        this.acumuladorA = value;
    }

    @Override
    public Integer getAcumuladorA() {
        return this.acumuladorA;
    }

    @Override
    public void setAcumuladorB(Integer value) {
        this.acumuladorB = value;
    }

    @Override
    public Integer getAcumuladorB() {
        return this.acumuladorB;
    }

    @Override
    public void setAddr(Integer addr) {
        estaEnElRangoDeMemoria(addr);
        this.memoria.set(addr, this.acumuladorA);
    }

    @Override
    public Integer getAddr(Integer addr) {
        estaEnElRangoDeMemoria(addr);
        return this.memoria.get(addr);
    }

    private void estaEnElRangoDeMemoria(Integer direccionMemoria) {
        if (direccionMemoria < 0 || direccionMemoria >= this.memoria.size()) {
            throw new IllegalArgumentException("Dirección de memoria " + direccionMemoria + " inválida");
        }
    }

    @Override
    public void reset() {
        this.acumuladorA = 0;
        this.acumuladorB = 0;
        this.programCounter = 0;
        this.memoria = Arrays.asList(new Integer[1024]);
    }
}
