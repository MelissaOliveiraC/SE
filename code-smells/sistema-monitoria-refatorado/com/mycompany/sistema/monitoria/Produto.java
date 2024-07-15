package com.mycompany.sistema.monitoria;

public class Produto {

    private String nome;
    private float valor;
    private int quantidade;
    private float peso;
    private float subtotal;

    public Produto(String nome, float valor, int quantidade, float peso) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.peso = peso;
        this.subtotal = valor * quantidade; 
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPeso() {
        return peso;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
}