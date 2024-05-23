package src.main;

import java.util.Scanner;
import src.controle.Controle;
import src.services.AlunoService;
import src.services.DebitoService;
import src.services.LivroService;
import src.services.EmprestimoService;
import src.services.impl.AlunoServiceImpl;
import src.services.impl.DebitoServiceImpl;
import src.services.impl.LivroServiceImpl;
import src.services.impl.EmprestimoServiceImpl;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] codigos = new int[14];
        System.out.print("Digite o RA do Aluno: ");
        String aluno = entrada.nextLine();
        System.out.print("Digite o número de Livros a ser Emprestado: ");
        int num = entrada.nextInt();
        int aux;
        for (int i = 0; i < num; i++) {
            System.out.print("Digite o codigo do livro: " + (i + 1) + ": ");
            aux = entrada.nextInt();
            codigos[i] = aux;
        }

        AlunoService alunoService = new AlunoServiceImpl(new DebitoServiceImpl());
        LivroService livroService = new LivroServiceImpl();
        EmprestimoService emprestimoService = new EmprestimoServiceImpl();

        Controle controle = new Controle(alunoService, livroService, emprestimoService);
        controle.emprestar(aluno, codigos, num);
    }
}