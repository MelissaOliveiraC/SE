package sistema_monitoria_refatorado;

public class Produto {
    private String nome;
    private double valor;
    private int quantidade;
    private double peso;

    public Produto(String nome, double valor, int quantidade, double peso) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPeso() {
        return peso;
    }

    public double getSubtotal() {
        return valor * quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}