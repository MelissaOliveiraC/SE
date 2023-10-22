package parte2;


public class Livro {

	int prazo;
	boolean exemplarBiblioteca;
	Titulo titulo;

	public Livro(int codigo) {
		super();
		//instancia um titulo e o associa ao livro
		titulo = new Titulo(codigo);
		//codigo aleatorio para definir se o livro e exemplar unico
		if (codigo == 2 || codigo == 4 )
			exemplarBiblioteca =true;
		else
			exemplarBiblioteca =false;
	}

	public int verPrazo() {
		return titulo.getPrazo();
	}

	public boolean verificaLivro() {  
    return exemplarBiblioteca;  
	}
}