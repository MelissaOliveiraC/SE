package src.models;

public class Livro {
    private Titulo titulo;
    private int codigo;

    public Livro(int codigo) {
        this.titulo = new Titulo(codigo);
        this.codigo = codigo;
    }

    public int verPrazo() {
        return titulo.getPrazo();
    }

    public boolean verificaLivro() {
        return this.codigo == 3;
    }
}