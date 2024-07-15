package com.mycompany.sistema.monitoria;

public class SistemaMonitoria {

    public static void inicio() {
        String nome = InputUtils.lerNomeOperador();
        int cargo = InputUtils.lerCargo();

        if (cargo == 1) {
            Funcionario f1 = new Funcionario(nome);
            f1.opcoes();
        } else {
            Administrador adm = new Administrador(nome);
            adm.opcoes();
        }
    }

    public static void main(String[] args) {
        inicio();
        InputUtils.fecharScanner();
    }
}