package com.trabalho.trabalhotesteptdois;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoTest {

    private Emprestimo emprestimo;

    @BeforeEach
    public void setUp() {
        emprestimo = new Emprestimo();  // Inicializa obj antes de cada teste
    }

    // Testa o caso em que todos os livros estão disponíveis
    @Test
    public void testEmprestarLivrosDisponiveis() {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(1));  // Livro com prazo 2
        livros.add(new Livro(2));  // Livro com prazo 3

        assertTrue(emprestimo.emprestar(livros), "Empréstimo deveria ser permitido quando todos os livros estão disponíveis.");
    }

    // Testa o caso em que o aluno não pode realizar o empréstimo (RA inválido)
    @Test
    public void testEmprestimoAlunoIndevido() {
        Controle controle = new Controle();  
        int[] livrosCodigos = {1, 2};  // Códigos de livros válidos
        int numLivros = 2;
        String aluno = "4";  // RA inválido

        assertFalse(controle.emprestar(aluno, livrosCodigos, numLivros), "Empréstimo não deveria ser permitido para aluno com RA inválido.");
    }

    // Testa o caso em que o código do aluno está vazio (RA válido)
    @Test
    public void testEmprestimoAlunoComCodigoValido() {
        Controle controle = new Controle();
        int[] livrosCodigos = {1, 2};  // Códigos de livros válidos
        int numLivros = 2;
        String aluno = "123";  // RA válido

        assertTrue(controle.emprestar(aluno, livrosCodigos, numLivros), "Empréstimo deveria ser permitido para aluno com RA válido.");
    }

    // Testa o caso de um livro específico estar em débito
    @Test
    public void testEmprestimoLivroEmDebito() {
        Controle controle = new Controle();  
        int[] livrosCodigos = {3};  // Código de livro que está em débito
        int numLivros = 1;
        String aluno = "2";  // RA válido

        assertFalse(controle.emprestar(aluno, livrosCodigos, numLivros), "Empréstimo não deveria ser permitido quando há débito.");
    }
}