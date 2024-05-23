package src.services.impl;

import java.util.List;
import src.models.Emprestimo;
import src.models.Livro;
import src.services.EmprestimoService;

public class EmprestimoServiceImpl implements EmprestimoService {

    @Override
    public boolean emprestar(List<Livro> livros) {
        Emprestimo e = new Emprestimo();
        return e.emprestar(livros);
    }
}