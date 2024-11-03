package com.trabalho.trabalhotestes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

public class ItemTest {

    private Livro livro;
    private Item item;

    @BeforeEach
    public void setup() {
        livro = new Livro(5); // prazo = 6 dias (5 + 1)
        item = new Item(livro);
    }

    @Test
    public void testCalculaDataDevolucao() {
        Date dataEmprestimo = new Date();

        Date dataDevolucao = item.calculaDataDevolucao(dataEmprestimo);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataEmprestimo);
        calendar.add(Calendar.DATE, livro.verPrazo()); // prazo do livro

        Date expectedDataDevolucao = calendar.getTime();
        assertEquals(expectedDataDevolucao, dataDevolucao, "A data de devolução calculada não está correta para o item.");
    }

    @Test
    public void testDataDevolucaoNaoAlteradaSemCalculo() {
        assertNull(item.getDataDevolucao(), "A data de devolução deve ser null antes do cálculo.");
    }
}