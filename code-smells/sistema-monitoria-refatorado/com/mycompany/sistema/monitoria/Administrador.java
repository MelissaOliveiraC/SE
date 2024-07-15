package com.mycompany.sistema.monitoria;

public class Administrador extends Funcionario {

    public Administrador(String nome) {
        super(nome);
        setAdmin(true);
    }
    
    private void setAdmin(boolean isAdmin) {
        this.admin = isAdmin;
    }

    // Método estático para criar um Administrador
    public static Administrador criar(String nome) {
        return new Administrador(nome);
    }
}