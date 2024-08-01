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
public final class Picanha extends Produtos {

    private Scanner in = new Scanner(System.in);

    public Picanha(boolean admin) {
        if (admin == true) {
            setValor();
        } else {
            this.valor = (float) 43.90;
        }
        this.nome = "Picanha";
        quantidade();
        peso();
        valor_subtotal();
    }

    private void setValor() {
        float valor;
        System.out.println("Digite um valor para a Picanha:");
        valor = in.nextFloat();
        this.valor = valor;
    }

    @Override
    public void quantidade() {
        int quantidade1;
        System.out.println("Digite a quantidade: ");
        quantidade1 = in.nextInt();
        this.quantidade = quantidade1;
        System.out.println("this.Quantidade = " + this.quantidade);
    }

    @Override
    public void peso() {
        float peso1;
        System.out.println("Digite o peso: (caso não tenha, apenas digite 1)");
        peso1 = in.nextFloat();
        this.peso = peso1;
        System.out.println("this.Peso = " + this.peso);
    }

    @Override
    public void valor_subtotal() {
        float subtotal1;
        subtotal1 = this.peso * this.quantidade * this.valor;
        this.subtotal = subtotal1;
         System.out.println("this.Subtotal = " + this.subtotal);
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
