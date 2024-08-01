package sistema_monitoria_refatorado;

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
                    case 1 -> realizarVenda();
                    case 2 -> acessarFerramentas();
                    case 0 -> System.out.println("Saindo do Sistema...");
                    default -> System.out.println("Opção Inválida!");
                }
            } while (opc != 0);
        }
    }

    public boolean isAdmin() {
        return admin;
    }

    private void realizarVenda() {
        Venda venda = new Venda(admin, nome);
        venda.iniciarVenda();
    }

    private void acessarFerramentas() {
        if (admin) {
            FerramentasAdmin ferramentasAdmin = new FerramentasAdmin(admin);
            ferramentasAdmin.iniciarFerramentas();
        } else {
            System.out.println("Acesso negado! Você não tem permissão para acessar as ferramentas.");
        }
    }

    private void imprimeMenuPrincipal() {
        System.out.println(
                "1 - Venda\n" +
                "2 - Ferramentas\n" +
                "0 - Sair"
        );
    }

    public static Funcionario criar(String nome) {
        return new Funcionario(nome);
    }
}