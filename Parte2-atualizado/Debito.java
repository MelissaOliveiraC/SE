package parte2;

public class Debito {
	int codigoAluno;
	public Debito(int aluno){
		this.codigoAluno =aluno;
	}
	
	public boolean verificaDebito()
	{
	//codigo aleatorio para definir se o aluno tem debito
	//e necessario fazer a verificacao de forma persistente
	if(this.codigoAluno == 4)
		 return false;
	 else
		return true;
	}

}