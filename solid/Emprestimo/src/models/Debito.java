package src.models;

public class Debito {
    private int codigoAluno;

    public Debito(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public boolean verificaDebito() {
        return codigoAluno != 4;
    }
}