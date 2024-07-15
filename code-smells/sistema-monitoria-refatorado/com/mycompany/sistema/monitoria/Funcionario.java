package com.mycompany.sistema.monitoria;

import java.util.Scanner;

public class Funcionario {

    private String nome;
    protected boolean admin;

    public Funcionario(String nome) {
        this.nome = nome;
        this.admin = false;
    }

    public void opcoes() {
        try (Scanner in = new Scanner(System.in)) {
            int opc;
            do {
                imprimeMenuPrincipal();
                opc = in.nextInt();
                switch (opc) {
                    case 1:
                        Venda venda = new Venda(admin, nome);
                        venda.iniciarVenda();
                        break;
                    case 2:
                        FerramentasAdmin ferramentasAdmin = new FerramentasAdmin(admin);
                        ferramentasAdmin.iniciarFerramentas();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Opção Inválida!");
                }
            } while (opc != 0);
        }
    }

    public boolean isAdmin() {
        return admin;
    }

    private void imprimeMenuPrincipal() {
        System.out.println("""
                1 - Venda
                2 - Ferramentas
                0 - Sair
                """);
    }

    // Método estático para criar um Funcionario
    public static Funcionario criar(String nome) {
        return new Funcionario(nome);
    }
}