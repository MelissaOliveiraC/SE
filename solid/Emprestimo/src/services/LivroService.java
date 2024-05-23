package src.services;

import java.util.List;
import src.models.Livro;

public interface LivroService {
    List<Livro> criarLivros(int[] codigos, int num);
}