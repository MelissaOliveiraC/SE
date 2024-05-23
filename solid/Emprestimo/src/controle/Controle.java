package src.controle;

import java.util.List;
import src.models.Aluno;
import src.models.Livro;
import src.services.AlunoService;
import src.services.LivroService;
import src.services.EmprestimoService;

public class Controle {

    private AlunoService alunoService;
    private LivroService livroService;
    private EmprestimoService emprestimoService;

    public Controle(AlunoService alunoService, LivroService livroService, EmprestimoService emprestimoService) {
        this.alunoService = alunoService;
        this.livroService = livroService;
        this.emprestimoService = emprestimoService;
    }

    public boolean emprestar(String aluno, int[] prazos, int num) {
        boolean retorno = true;
        Aluno a = alunoService.buscarAluno(aluno);

        if (!alunoService.verificaExistencia(a)) {
            System.out.println("Aluno Inexistente");
            retorno = false;
        }

        if (!alunoService.verificaDebito(a)) {
            System.out.println("Aluno em Debito");
            retorno = false;
        }

        if (retorno) {
            List<Livro> livros = livroService.criarLivros(prazos, num);
            if (livros.size() > 0) {
                retorno = emprestimoService.emprestar(livros);
                return retorno;
            } else {
                return false;
            }
        } else {
            return retorno;
        }
    }
}