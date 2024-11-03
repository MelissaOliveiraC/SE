package com.trabalho.trabalhotestes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoTest {

    private Emprestimo emprestimo;
    private Date dataEmprestimo;

    @BeforeEach
    void setUp() {
        emprestimo = new Emprestimo();
        dataEmprestimo = emprestimo.getDataEmprestimo();

        // Configuração inicial dos itens de empréstimo
        emprestimo.i.add(new Item(new Livro(1)));
        emprestimo.i.add(new Item(new Livro(2)));
        emprestimo.i.add(new Item(new Livro(3)));
    }

    /**
     * Testa a data de devolução com três itens (Partição de Equivalência).
       Verifica se a data de devolução considera o prazo mais longo entre os itens.
     */
    @Test
    void testCalculaDataDevolucaoComTresItens() {
        Date dataPrevista = emprestimo.CalculaDataDevolucao();

        assertNotNull(dataPrevista, "A data prevista não deveria ser nula");
        assertTrue(dataPrevista.after(dataEmprestimo), "A data prevista deve ser após a data de empréstimo");
    }

    /**
     * Testa o impacto de adicionar mais de dois itens ao empréstimo,
       verificando se o prazo é estendido (Análise de Valor Limite).
     */
    @Test
    void testCalculaDataDevolucaoComMaisDeDoisItens() {
        Date dataComTresItens = emprestimo.CalculaDataDevolucao();

        // Adiciona um quarto item para testar o aumento de prazo
        emprestimo.i.add(new Item(new Livro(4)));
        Date dataComQuatroItens = emprestimo.CalculaDataDevolucao();

        assertTrue(dataComQuatroItens.after(dataComTresItens),
                "A data com quatro itens deveria ser após a data com três itens");
    }

    /**
     * Verifica se a data de devolução para cada item é corretamente configurada.
       Confere também se a data é igual à data prevista do empréstimo (Tabela de Decisão).
     */
    @Test
    void testItensRecebemDataDevolucaoCorreta() {
        Date dataPrevista = emprestimo.CalculaDataDevolucao();

        for (Item item : emprestimo.i) {
            assertEquals(dataPrevista, item.getDataDevolucao(),
                    "A data de devolução do item deve ser igual à data prevista do empréstimo");
        }
    }

    /**
       Testa a data de devolução usando limites específicos para o prazo do item.
     */
    @Test
    void testDataDevolucaoComLimiteDePrazo() {
        Item itemComPrazoLimite = new Item(new Livro(1)); // Livro com código 1 terá prazo 2
        emprestimo.i.clear();
        emprestimo.i.add(itemComPrazoLimite);

        Date dataCalculada = emprestimo.CalculaDataDevolucao();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataEmprestimo);
        calendar.add(Calendar.DATE, itemComPrazoLimite.getLivro().verPrazo());

        Date dataEsperada = calendar.getTime();
        assertEquals(dataEsperada, dataCalculada, "A data calculada para o item com prazo limite não está correta");
    }
}