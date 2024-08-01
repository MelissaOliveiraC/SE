package sistema_monitoria_refatorado;

public class Administrador extends Funcionario {
    
    private boolean isAdmin;

    public Administrador(String nome) {
        super(nome);
        setAdmin(true);
    }

    public static Administrador criar(String nome) {
        return new Administrador(nome);
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
