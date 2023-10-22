package parte2;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		 Scanner entrada = new Scanner (System.in);
		 int[] codigos= {1,2,3,04,5,6,7,8,9,10,11,12,13,14};
		 System.out.print("Digite o RA do Aluno: ");
		 String aluno = entrada.nextLine();
		 System.out.print("Digite o número de Livros a ser Emprestado: ");
		 int num = entrada.nextInt();
		 int aux;
		 for(int i=0;i<num;i++)
		 {
			 System.out.print("Digite o codigo do livro: "+(i+1));
			 aux=entrada.nextInt();
			 codigos[i]=aux;
		 }
		 
        Controle c = new Controle();
        c.emprestar(aluno, codigos, num);
    	 
    		 
	}

}
