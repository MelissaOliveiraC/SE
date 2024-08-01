package com.mycompany.sistema.monitoria;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Funcionario {

    private Scanner in = new Scanner(System.in);
    private String nome;
    protected boolean admin;
    private Cliente c;
    private Set<Cliente> lista_clientes = new HashSet<>();

    public Funcionario(String nome) {
        this.nome = nome;
        admin = false;
    }

    private void imprimeHome() {
        System.out.println("""
                           1 - Venda
                           2 - Ferramentas
                           0 - Sair
                           """);
    }

    private void imprimeFerramentasAdmin() {
        System.out.println("""
                           1 - Gerar nota fiscal
                           2 - Cancelar Compra
                           3 - Visualizar compras
                           4 - Voltar
                           """);
    }

    private void novoCliente() {
        lista_clientes.add(c);
    }

    private void visualizaCompras() {
        for (Cliente cliente : lista_clientes) {
            cliente.geraNotaFiscal();
        }
        
        System.out.println("Total de clientes: " + Cliente.getTotalClientes());
    }

    private void ferramentas(boolean adm) {
        int opc;
        do {
            imprimeFerramentasAdmin();
            opc = in.nextInt();
            switch (opc) {
                case 1:
                    c.geraNotaFiscal();
                    novoCliente();
                    return;
                case 2:
                    if (adm == false) {
                        System.out.println("Você nao tem permissão para cancelar a compra.");
                    } else {
                        System.out.println("Compra cancelada");
                        c.limpaCompra();
                    }
                case 3:
                    if (adm == false) {
                        System.out.println("Voce nao tem permissao para usar essa funcao!.");
                    } else {
                        visualizaCompras();
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opcao Invalida");
                    ;
            }
        } while (opc != 4);
    }

    private void imprimeVenda() {
        System.out.println("""
                           1 - Maca
                           2 - Arroz
                           3 - Sprite
                           4 - Coca-Cola
                           5 - Trakinas
                           6 - Picanha
                           0 - Voltar
                           """);
    }

    private void venda() {
        c = new Cliente();
        int op;
        do {
            imprimeVenda();
            op = in.nextInt();
            switch (op) {
                case 1:
                    Maca maca = new Maca(this.admin);
                    c.adicionaProdutoLista(maca);
                    break;
                case 2:
                    Arroz arroz = new Arroz(this.admin);
                    c.adicionaProdutoLista(arroz);
                    break;
                case 3:
                    Sprite sprite = new Sprite(this.admin);
                    c.adicionaProdutoLista(sprite);
                    break;
                case 4:
                    CocaCola coca = new CocaCola(this.admin);
                    c.adicionaProdutoLista(coca);
                    break;
                case 5:
                    Trakinas trakinas = new Trakinas(this.admin);
                    c.adicionaProdutoLista(trakinas);
                    break;
                case 6:
                    Picanha picanha = new Picanha(this.admin);
                    c.adicionaProdutoLista(picanha);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Numero incorreto");
            }
        } while (op != 0);
    }

    protected void opcoes() {
        int opc;
        do {
            imprimeHome();
            opc = in.nextInt();
            switch (opc) {
                case 1:
                    venda();
                    break;
                case 2:
                    ferramentas(admin);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opcao Invalida!");
            }
        } while (opc != 0);
    }

    public boolean getAdmin() {
        return admin;
    }
}
