package src.models;

public class Aluno {
    private String RA;

    public Aluno(String RA) {
        this.RA = RA;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public boolean verificaAluno() {
        return !this.RA.equals("10");
    }
}