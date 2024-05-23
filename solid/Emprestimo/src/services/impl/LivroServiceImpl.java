package src.services.impl;

import java.util.ArrayList;
import java.util.List;
import src.models.Livro;
import src.services.LivroService;

public class LivroServiceImpl implements LivroService {

    @Override
    public List<Livro> criarLivros(int[] codigos, int num) {
        List<Livro> livros = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Livro l = new Livro(codigos[i]);
            if (!l.verificaLivro()) {
                livros.add(l);
            }
        }
        return livros;
    }
}