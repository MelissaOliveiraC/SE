package com.mycompany.sistema.monitoria;

import java.util.Scanner;

public class InputUtils {

    private static final Scanner scanner = new Scanner(System.in);

    public static String lerNomeOperador() {
        System.out.println("Digite o nome do operador: ");
        return scanner.nextLine();
    }

    public static int lerCargo() {
        System.out.println("Qual é o cargo:\n1 - Funcionario\n2 - Gerente");
        return scanner.nextInt();
    }

    public static void fecharScanner() {
        scanner.close();
    }
}