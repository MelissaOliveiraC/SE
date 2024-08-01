package sistema_monitoria_refatorado;

import java.util.Scanner;

public class InputUtils {

    private static final Scanner scanner = new Scanner(System.in);

    private InputUtils() {
        // Construtor privado para evitar instanciação da classe
    }

    public static String lerNomeOperador() {
        System.out.println("Digite o nome do operador: ");
        return scanner.nextLine();
    }

    public static int lerCargo() {
        System.out.println("Qual é o cargo:\n1 - Funcionário\n2 - Gerente");
        int cargo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        return cargo;
    }

    public static void fecharScanner() {
        scanner.close();
    }
}