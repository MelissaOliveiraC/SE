package bilbioteca;

import java.util.Calendar;
import java.util.Date;

public class Item {
   /*Cada Item é associado a um livro*/
    Livro livro;
    Date dataDevolucao;
 
    /*Constructor, quando uma instancia do item é criada
     * já é associada a ela o livro*/
    public Item(Livro livro) {
		super();
		this.livro = livro;
	}
    
    /*Método getDataDevolucao*/
	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	/*Método setDataDevolucao*/
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	/*Método getLivro*/
	public Livro getLivro() {
		return livro;
	}
	
	/*Método setLivro*/
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public Date calculaDataDevolucao(Date data) {

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(data);

            // Supondo que você obtenha o prazo do livro corretamente
            int prazo = livro.verPrazo();

            calendar.add(Calendar.DATE, prazo);
        return calendar.getTime();
    }

		
}