package com.mycompany.sistema.monitoria;

import java.util.Scanner;

public class FerramentasAdmin {

    private boolean admin;

    public FerramentasAdmin(boolean admin) {
        this.admin = admin;
    }

    public void iniciarFerramentas() {
        try (Scanner in = new Scanner(System.in)) {
            int opc;
            do {
                imprimeMenuFerramentas();
                opc = in.nextInt();
                processaOpcao(opc);
            } while (opc != 4);
        }
    }

    private void imprimeMenuFerramentas() {
        System.out.println("""
                1 - Gerar nota fiscal
                2 - Cancelar Compra
                3 - Visualizar compras
                4 - Voltar
                """);
    }

    private void processaOpcao(int opc) {
        switch (opc) {
            case 1:
                // Lógica para gerar nota fiscal
                break;
            case 2:
                if (!admin) {
                    System.out.println("Você não tem permissão para cancelar a compra.");
                } else {
                    System.out.println("Compra cancelada");
                    // Lógica para limpar compra
                }
                break;
            case 3:
                if (!admin) {
                    System.out.println("Você não tem permissão para usar essa função!");
                } else {
                    // Lógica para visualizar compras
                }
                break;
            case 4:
                return;
            default:
                System.out.println("Opção Inválida");
        }
    }
}