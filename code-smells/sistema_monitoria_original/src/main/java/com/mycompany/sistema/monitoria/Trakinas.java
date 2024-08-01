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
public final class Trakinas extends Produtos {

    private Scanner in = new Scanner(System.in);

    public Trakinas(boolean admin) {
        if (admin == true) {
            setValor();
        } else {
            this.valor = (float) 3.49;
        }
        this.nome = "Trakinas";
        quantidade();
        peso();
        valor_subtotal();
    }

    private void setValor() {
        float valor;
        System.out.println("Digite um valor para o Trakinas:");
        valor = in.nextFloat();
        this.valor = valor;
    }

    @Override
    public void quantidade() {
        int quantidade1;
        System.out.println("Digite a quantidade: ");
        quantidade1 = in.nextInt();
        this.quantidade = quantidade1;
    }

    @Override
    public void peso() {
        float peso1;
        System.out.println("Digite o peso: (caso não tenha, apenas digite 1)");
        peso1 = in.nextFloat();
        this.peso = peso1;
    }

    @Override
    public void valor_subtotal() {
        float subtotal1;
        subtotal1 = this.peso * this.quantidade * this.valor;
        this.subtotal = subtotal1;
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
