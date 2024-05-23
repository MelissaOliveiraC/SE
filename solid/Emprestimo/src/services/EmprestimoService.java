package src.services;

import java.util.List;
import src.models.Livro;

public interface EmprestimoService {
    boolean emprestar(List<Livro> livros);
}