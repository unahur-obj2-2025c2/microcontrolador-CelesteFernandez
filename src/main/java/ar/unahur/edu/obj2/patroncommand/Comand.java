package ar.unahur.edu.obj2.patroncommand;

public abstract class Comand implements Operable {
    
    @Override
    public void execute(Programable micro) {
        this.doExecute(micro);
        micro.incProgramCounter();
    }

    protected abstract void doExecute(Programable micro);
}
