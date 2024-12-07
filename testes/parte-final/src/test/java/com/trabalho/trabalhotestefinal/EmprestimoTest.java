package com.trabalho.trabalhotestefinal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class EmprestimoTest {

    private Emprestimo emprestimo;
    private Livro livroValido;
    private Livro livroIndisponivel;

    private static final int LIVRO_VALIDO_CODIGO = 1;
    private static final int LIVRO_INDISPONIVEL_CODIGO = 3;
    private static final int LIMITE_LIVROS = 100; // num alto p/teste

    @BeforeEach
    public void setUp() {
        livroValido = new Livro(LIVRO_VALIDO_CODIGO);
        livroIndisponivel = new Livro(LIVRO_INDISPONIVEL_CODIGO);
        emprestimo = new Emprestimo();
    }

    private List<Livro> criarLivros(List<Integer> codigos) {
        List<Livro> livros = new ArrayList<>();
        for (int codigo : codigos) {
            livros.add(new Livro(codigo));
        }
        return livros;
    }

    @Test
    public void testEmprestimoComLivroDisponivel() {
        List<Livro> livros = criarLivros(List.of(LIVRO_VALIDO_CODIGO));

        boolean resultado = emprestimo.emprestar(livros);

        assertTrue(resultado, "Empréstimo deveria ser permitido para livro disponível.");
    }

    @Test
    public void testEmprestimoComLivroIndisponivel() {
        List<Livro> livros = criarLivros(List.of(LIVRO_INDISPONIVEL_CODIGO));

        boolean resultado = emprestimo.emprestar(livros);

        assertFalse(resultado, "Empréstimo não deveria ser permitido para livro indisponível.");
    }

    @Test
    public void testEmprestimoComLivrosValidos() {
        List<Livro> livros = criarLivros(List.of(LIVRO_VALIDO_CODIGO, LIVRO_VALIDO_CODIGO));

        boolean resultado = emprestimo.emprestar(livros);

        assertTrue(resultado, "Empréstimo deveria ser permitido para múltiplos livros válidos.");
    }

    @Test
    public void testEmprestimoSemLivros() {
        List<Livro> livros = new ArrayList<>();

        boolean resultado = emprestimo.emprestar(livros);

        assertFalse(resultado, "Empréstimo não deveria ser permitido sem livros.");
    }

    @Test
    public void testEmprestimoComLivrosIndisponiveis() {
        List<Livro> livros = criarLivros(List.of(LIVRO_INDISPONIVEL_CODIGO, LIVRO_INDISPONIVEL_CODIGO));

        boolean resultado = emprestimo.emprestar(livros);

        assertFalse(resultado, "Empréstimo não deveria ser permitido com livros indisponíveis.");
    }

    @Test
    public void testEmprestimoComLivrosExcedendoLimite() {
        List<Livro> livros = new ArrayList<>();
        for (int i = 0; i < LIMITE_LIVROS; i++) {
            livros.add(livroValido);
        }

        boolean resultado = emprestimo.emprestar(livros);

        assertTrue(resultado, "Empréstimo deveria ser permitido mesmo com número elevado de livros.");
    }
}