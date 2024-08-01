package sistema_monitoria_refatorado;

public class SistemaMonitoria {

    public static void main(String[] args) {
        iniciarMonitoria();
    }

    private static void iniciarMonitoria() {
        String nome = InputUtils.lerNomeOperador();
        int cargo = InputUtils.lerCargo();

        if (cargo == 1) {
            Funcionario funcionario = new Funcionario(nome);
            funcionario.opcoes();
        } else {
            Administrador administrador = new Administrador(nome);
            administrador.opcoes();
        }

        InputUtils.fecharScanner();
    }
}