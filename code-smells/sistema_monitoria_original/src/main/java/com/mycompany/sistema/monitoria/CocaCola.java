/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.monitoria;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public final class CocaCola extends Produtos {

    private Scanner in = new Scanner(System.in);

    public CocaCola(boolean admin) {
        if (admin == true) {
            setValor();
        } else {
            this.valor = (float) 7.99;
        }
        this.nome = "Coca-Cola";
        quantidade();
        peso();
        valor_subtotal();
    }

    private void setValor() {
        float valor;
        System.out.println("Digite um valor para a Coca Cola:");
        valor = in.nextFloat();
        this.valor = valor;
    }

    @Override
    public void quantidade() {
        int quantidade;
        System.out.println("Digite a quantidade: ");
        quantidade = in.nextInt();
        this.quantidade = quantidade;
    }

    @Override
    public void peso() {
        float peso;
        System.out.println("Digite o peso: (caso não tenha, apenas digite 1)");
        peso = in.nextFloat();
        this.peso = peso;
    }

    @Override
    public void valor_subtotal() {
        float subtotal;
        subtotal = this.peso * this.quantidade * this.valor;
        this.subtotal = subtotal;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public float getSubtotal() {
        return this.subtotal;
    }

}
