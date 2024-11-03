package com.trabalho.trabalhotestes;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author melissa
 */

public class Emprestimo {

    Date dataEmprestimo = new Date();
    /*metodo para gegar a variavel dataEmprestimo*/
    public Date getDataEmprestimo() {
            return dataEmprestimo;
    }

    /*metodo para setar a variavel dataEmprestimo*/
    public void setDataEmprestimo(Date dataEmprestimo) {
            this.dataEmprestimo = dataEmprestimo;
    }

    /*utilize essas v�riaveis para calcular a data final de devolu��o*/
    Date dataPrevista = new Date();
    Date data_aux = new Date();
    String nome;

    /*Cada Emprestimo � composto de varios itens*/
    List<Item> i = new ArrayList<Item>();
	
    //Metodo respons�vel por calcular a data de devolu��o
    public Date CalculaDataDevolucao() {   
    Date date = new Date();

        for(int j=0;j<i.size();j++)
        {   data_aux = i.get(j).calculaDataDevolucao(date);
            if( dataPrevista.compareTo(data_aux) < 0)
                  dataPrevista = data_aux;
        }
        
        if(i.size()>2) {
            int tam = i.size()-2;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dataPrevista);
            calendar.add(Calendar.DATE, (tam*2));
            dataPrevista = calendar.getTime();
        }
        
        for(int j=0;j<i.size();j++)
                i.get(j).setDataDevolucao(dataPrevista);

        return dataPrevista; 
    }
}