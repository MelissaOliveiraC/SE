package sistema_monitoria_refatorado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venda {
    private String funcionarioNome;
    private boolean isAdmin;
    private List<Produto> produtos;
    private Cliente cliente;

    public Venda(boolean isAdmin, String funcionarioNome) {
        this.isAdmin = isAdmin;
        this.funcionarioNome = funcionarioNome;
        this.produtos = new ArrayList<>();
        this.cliente = new Cliente("Cliente");
    }

    public void iniciarVenda() {
        Scanner in = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            exibirMenuProdutos();
            int opc = in.nextInt();
            if (opc == 5) {
                continuar = false;
            } else {
                adicionarProduto(opc);
            }
        }

        cliente.geraNotaFiscal();
        cliente.limpaCompra();
    }

    private void exibirMenuProdutos() {
        System.out.println("Selecione o produto:\n1 - Abacaxi\n2 - Bala\n3 - Café\n4 - Refrigerante\n5 - Finalizar Compra");
    }

    private void adicionarProduto(int opcao) {
        Produto produto = criarProduto(opcao);
        cliente.adicionaProduto(produto);
    }

    private Produto criarProduto(int opcao) {
        return switch (opcao) {
            case 1 -> new Produto("Abacaxi", 2.0, 1, 0.5);
            case 2 -> new Produto("Bala", 1.0, 1, 0.1);
            case 3 -> new Produto("Café", 3.0, 1, 0.2);
            case 4 -> new Produto("Refrigerante", 4.0, 1, 1.0);
            default -> throw new IllegalArgumentException("Opção inválida");
        };
    }
}