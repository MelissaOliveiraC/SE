package sistema_monitoria_refatorado;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Produto> produtos;

    private static int totalClientes = 0;

    public Cliente(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
        totalClientes++;
    }

    public void adicionaProduto(Produto produto) {
        produtos.add(produto);
    }

    public void geraNotaFiscal() {
        float totalCompra = calculaTotalCompra();
        System.out.println("\n\n--GERANDO NOTA FISCAL--\n\nNome: " + nome);
        for (Produto produto : produtos) {
            System.out.printf("%-25s %,10.2f\n", produto.getNome(), produto.getSubtotal());
        }
        System.out.printf("%-25s %,10.2f\n", "Total da Compra:", totalCompra);
    }

    private float calculaTotalCompra() {
        float total = 0;
        for (Produto produto : produtos) {
            total += produto.getSubtotal();
        }
        return total;
    }

    public void limpaCompra() {
        produtos.clear();
    }

    public static int getTotalClientes() {
        return totalClientes;
    }
}