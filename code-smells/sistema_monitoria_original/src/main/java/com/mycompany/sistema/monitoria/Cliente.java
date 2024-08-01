package com.mycompany.sistema.monitoria;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Cliente {

    private Scanner input = new Scanner(System.in);
    private String nome_cliente;
    private List<Produtos> lista_produtos = new ArrayList<>();
    private static int totalClientes = 0;
    private float totalCompra = 0;

    public Cliente() {
        System.out.println("Digite o nome do cliente: ");
        this.nome_cliente = input.nextLine();
        totalClientes++;
    }

    public void adicionaProdutoLista(Produtos p) {
        lista_produtos.add(p);
    }
    
    
    public static int getTotalClientes(){
        return totalClientes;
    }

    public void geraNotaFiscal() {
        System.out.println("\n\n--GERANDO NOTA FISCAL--");
        System.out.println("Nome: " + this.nome_cliente);
        for (Produtos c : lista_produtos) {
            System.out.printf("%-25s %,10.2f\n", c.getNome(), c.subtotal);
            totalCompra += c.subtotal;
        }
        System.out.printf("%-25s %,10.2f\n", "Total da Compra:", totalCompra);
        System.out.println();
        System.out.println();
    }

    public void limpaCompra() {
        lista_produtos.clear();
        this.totalCompra = 0;
    }

}
