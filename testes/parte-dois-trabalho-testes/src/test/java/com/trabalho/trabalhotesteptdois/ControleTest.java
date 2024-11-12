package com.trabalho.trabalhotesteptdois;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class ControleTest {

    private Controle controle;

    @BeforeEach
    public void setUp() {
        controle = new Controle();
    }

    @Test
    public void testEmprestimoAlunoValidoSemDebitoComLivrosDisponiveis() {
        int[] livrosCodigos = {1, 2};  // Livros com código válido
        int numLivros = 2;
        String aluno = "1";  // RA válido

        boolean resultado = controle.emprestar(aluno, livrosCodigos, numLivros);
        assertTrue(resultado, "Empréstimo deveria ser permitido para aluno válido sem débito e com livros disponíveis.");
    }

    @Test
    public void testEmprestimoAlunoInvalido() {
        int[] livrosCodigos = {1, 2};  // Livros com código válido
        int numLivros = 2;
        String aluno = "10";  // RA inválido

        boolean resultado = controle.emprestar(aluno, livrosCodigos, numLivros);
        assertFalse(resultado, "Empréstimo não deveria ser permitido para aluno com RA inválido.");
    }

    @Test
    public void testEmprestimoAlunoComDebito() {
        int[] livrosCodigos = {1, 2};  // Livros com código válido
        int numLivros = 2;
        String aluno = "4";  // RA com débito

        boolean resultado = controle.emprestar(aluno, livrosCodigos, numLivros);
        assertFalse(resultado, "Empréstimo não deveria ser permitido para aluno com débito.");
    }

    @Test
    public void testEmprestimoLivroIndisponivel() {
        int[] livrosCodigos = {3};  // Livro com código inválido (indisponível)
        int numLivros = 1;
        String aluno = "1";  // RA válido

        boolean resultado = controle.emprestar(aluno, livrosCodigos, numLivros);
        assertFalse(resultado, "Empréstimo não deveria ser permitido quando algum livro está indisponível.");
    }

    @Test
    public void testEmprestimoTodosLivrosDisponiveis() {
        int[] livrosCodigos = {1, 2};  // Livros com código válido
        int numLivros = 2;
        String aluno = "1";  // RA válido

        boolean resultado = controle.emprestar(aluno, livrosCodigos, numLivros);
        assertTrue(resultado, "Empréstimo deveria ser permitido quando todos os livros estão disponíveis.");
    }

    @Test
    public void testEmprestimoMaisDeDoisLivros() {
        int[] livrosCodigos = {1, 2, 3, 4};  // Livros com código válido
        int numLivros = 4;
        String aluno = "1";  // RA válido

        boolean resultado = controle.emprestar(aluno, livrosCodigos, numLivros);
        assertTrue(resultado, "Empréstimo deve considerar o acréscimo de dias quando mais de 2 livros são emprestados.");
    }
}