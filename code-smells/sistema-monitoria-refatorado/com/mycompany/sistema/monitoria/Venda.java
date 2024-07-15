package com.mycompany.sistema.monitoria;

import java.util.Scanner;

public class Venda {

    private Cliente cliente;
    private boolean admin;

    // Construtor que aceita um boolean e um String
    public Venda(boolean admin, String nomeCliente) {
        this.admin = admin;
        this.cliente = new Cliente(nomeCliente);
    }

    public void iniciarVenda() {
        try (Scanner in = new Scanner(System.in)) {
            int op;
            do {
                imprimeMenuVenda();
                op = in.nextInt();
                Produto produto = criaProduto(op);
                if (produto != null) {
                    cliente.adicionaProdutosLista(produto);
                } else if (op == 0) {
                    return;
                } else {
                    System.out.println("Número incorreto");
                }
            } while (op != 0);
        }
    }
    
    private void imprimeMenuVenda() {
        System.out.println("""
                1 - Maçã
                2 - Arroz
                3 - Sprite
                4 - Coca-Cola
                5 - Trakinas
                6 - Picanha
                0 - Voltar
                """);
    }
    
    private Produto criaProduto(int op) {
        switch (op) {
            case 1:
                return new Produto("Maçã", 1.99f, 1, 0.2f);
            case 2:
                return new Produto("Arroz", 5.0f, 1, 1.0f);
            case 3:
                return new Produto("Sprite", 3.5f, 1, 0.5f);
            case 4:
                return new Produto("Coca-Cola", 4.0f, 1, 0.5f);
            case 5:
                return new Produto("Trakinas", 2.0f, 1, 0.1f);
            case 6:
                return new Produto("Picanha", 30.0f, 1, 2.0f);
            default:
                return null;
        }
    }    

    public Cliente getCliente() {
        return cliente;
    }
}