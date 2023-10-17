package bilbioteca;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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

	/*utilize essas váriaveis para calcular a data final de devolução*/
        Date dataPrevista = new Date();
	Date data_aux = new Date();
	String nome;

        /*Cada Emprestimo é composto de vários itens*/
	List<Item> i = new ArrayList<Item>();
	
        //Metodo responsável por calcular a data de devolução
	public Date CalculaDataDevolucao() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        
        Date dataPrevista = i.get(0).calculaDataDevolucao(date);

            for (int j = 1; j < i.size(); j++) {
                Date data_aux = i.get(j).calculaDataDevolucao(date);

                if (data_aux.after(dataPrevista)) {
                    dataPrevista = data_aux;
                    calendar.setTime(dataPrevista);
                }
            }

        return calendar.getTime();
    }

	
}