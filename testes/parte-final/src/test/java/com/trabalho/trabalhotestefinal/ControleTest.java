package com.trabalho.trabalhotestefinal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class ControleTest {

    private Controle controle;
    private String alunoValido;
    private String alunoInvalido;
    private int[] livrosCodigosValidos;

    private static final String ALUNO_VALIDO_RA = "1";
    private static final String ALUNO_INVALIDO_RA = "10";
    private static final int[] LIVROS_CODIGOS_VALIDOS = {1, 2};

    @BeforeEach
    public void setUp() {
        controle = new Controle();
        alunoValido = ALUNO_VALIDO_RA;
        alunoInvalido = ALUNO_INVALIDO_RA;
    }

    @Test
    public void testEmprestimoAlunoValidoSemDebitoComLivrosDisponiveis() {
        int numLivros = 2;

        boolean resultado = controle.emprestar(alunoValido, LIVROS_CODIGOS_VALIDOS, numLivros);
        assertTrue(resultado, "Empréstimo deveria ser permitido para aluno válido sem débito e com livros disponíveis.");
    }

    @Test
    public void testEmprestimoAlunoInexistente() {
        int numLivros = 2;

        boolean resultado = controle.emprestar(alunoInvalido, LIVROS_CODIGOS_VALIDOS, numLivros);
        assertFalse(resultado, "Empréstimo não deveria ser permitido para aluno inexistente.");
    }

    @Test
    public void testEmprestimoAlunoComDebito() {
        int numLivros = 2;
        String alunoComDebito = "4";  

        boolean resultado = controle.emprestar(alunoComDebito, LIVROS_CODIGOS_VALIDOS, numLivros);
        assertFalse(resultado, "Empréstimo não deveria ser permitido para aluno com débito.");
    }

    @Test
    public void testEmprestimoComLivrosIndisponiveis() {
        int[] livrosCodigosIndisponiveis = {3}; 
        int numLivros = 1;

        boolean resultado = controle.emprestar(alunoValido, livrosCodigosIndisponiveis, numLivros);
        assertFalse(resultado, "Empréstimo não deveria ser permitido se todos os livros forem indisponíveis.");
    }

    @Test
    public void testEmprestimoComGrandesQuantidadesDeLivros() {
        int[] livrosCodigosGrandes = new int[100]; 
        for (int i = 0; i < 100; i++) {
            livrosCodigosGrandes[i] = i + 1;
        }

        boolean resultado = controle.emprestar(alunoValido, livrosCodigosGrandes, 100);
        assertTrue(resultado, "Empréstimo deveria ser permitido para um número grande de livros.");
    }

    @Test
    public void testEmprestimoSemLivros() {
        int[] livrosCodigosVazios = new int[0];  
        int numLivros = 0;

        boolean resultado = controle.emprestar(alunoValido, livrosCodigosVazios, numLivros);
        assertFalse(resultado, "Empréstimo não deveria ser permitido sem livros.");
    }

    @Test
    public void testEmprestimoComDiversosAlunos() {
        int[] livrosCodigos = {1, 2, 4};
        String[] alunos = {"1", "2", "3", "10"};

        for (String aluno : alunos) {
            boolean resultado = controle.emprestar(aluno, livrosCodigos, livrosCodigos.length);
            if (aluno.equals("10")) {
                assertFalse(resultado, "Empréstimo não deveria ser permitido para o aluno com RA 10.");
            } else {
                assertTrue(resultado, "Empréstimo deveria ser permitido para o aluno com RA válido.");
            }
        }
    }
}