package com.mycompany.sistema.monitoria;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome_cliente;
    private List<Produto> lista_produtos = new ArrayList<>();
    private static int totalClientes = 0;

    public Cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
        totalClientes++;
    }

    public void adicionaProdutosLista(Produto p) {
        lista_produtos.add(p);
    }    
    
    public static int getTotalClientes() {
        return totalClientes;
    }

    public void geraNotaFiscal() {
        float totalCompra = calculaTotalCompra();
        System.out.println("\n\n--GERANDO NOTA FISCAL--");
        System.out.println("Nome: " + this.nome_cliente);
        for (Produto produto : lista_produtos) {
            System.out.printf("%-25s %,10.2f\n", produto.getNome(), produto.getSubtotal());
        }
        System.out.printf("%-25s %,10.2f\n", "Total da Compra:", totalCompra);
        System.out.println();
        System.out.println();
    }

    private float calculaTotalCompra() {
        float total = 0;
        for (Produto produto : lista_produtos) {
            total += produto.getSubtotal();
        }
        return total;
    }

    public void limpaCompra() {
        lista_produtos.clear();
    }
}