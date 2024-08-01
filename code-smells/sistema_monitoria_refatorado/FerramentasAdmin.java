package sistema_monitoria_refatorado;

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
                opc = exibirMenuFerramentas(in);
                processarOpcao(opc);
            } while (opc != 4);
        }
    }

    private int exibirMenuFerramentas(Scanner in) {
        System.out.println("""
                1 - Gerar nota fiscal
                2 - Cancelar Compra
                3 - Visualizar compras
                4 - Voltar
                """);
        return in.nextInt();
    }

    private void processarOpcao(int opc) {
        switch (opc) {
            case 1 -> gerarNotaFiscal();
            case 2 -> cancelarCompra();
            case 3 -> visualizarCompras();
            case 4 -> System.out.println("Saindo das Ferramentas Administrativas...");
            default -> System.out.println("Opção Inválida");
        }
    }

    private void gerarNotaFiscal() {
        // Lógica para gerar nota fiscal
        System.out.println("Nota fiscal gerada");
    }

    private void cancelarCompra() {
        if (!admin) {
            System.out.println("Você não tem permissão para cancelar a compra.");
        } else {
            System.out.println("Compra cancelada");
        }
    }

    private void visualizarCompras() {
        if (!admin) {
            System.out.println("Você não tem permissão para usar essa função!");
        } else {
            // Lógica para visualizar compras
            System.out.println("Visualizando compras");
        }
    }
}