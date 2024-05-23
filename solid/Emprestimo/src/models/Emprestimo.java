package src.models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Emprestimo {

    private Date dataEmprestimo = new Date();
    private Date dataPrevista = new Date();
    private Date data_aux = new Date();
    private List<Item> item = new ArrayList<>();

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public boolean emprestar(List<Livro> livros) {
        for (Livro livro : livros) {
            item.add(new Item(livro));
        }
        calculaDataDevolucao();
        System.out.print("\nNumero de Livros Emprestados: " + livros.size());
        System.out.print("\nData de Empréstimo: " + this.dataEmprestimo);
        System.out.print("\nData de Devolução: " + this.dataPrevista);
        return true;
    }

    private Date calculaDataDevolucao() {
        Date date = new Date();
        for (Item item : item) {
            data_aux = item.calculaDataDevolucao(date);
            if (dataPrevista.compareTo(data_aux) < 0) {
                dataPrevista = data_aux;
            }
        }
        if (item.size() > 2) {
            dataPrevista = adicionalData();
        }
        for (Item item : item) {
            item.setDataDevolucao(dataPrevista);
        }
        return dataPrevista;
    }

    private Date adicionalData() {
        int tam = item.size() - 2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataPrevista);
        calendar.add(Calendar.DATE, tam * 2);
        return calendar.getTime();
    }
}