public interface EstrategiaImposto {
    double calcularImposto(double valor);
}

public class ICMS implements EstrategiaImposto {
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.18; //Taxa de ICMS
    }
}

public class ISS implements EstrategiaImposto {
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.05; //Tx de ISS
    }
}

public class IPI implements EstrategiaImposto {
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.10; //Tx de IPI
    }
}

public class IOF implements EstrategiaImposto {
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.03; //Tx de IOF
    }
}

public class CalculadoraImpostos {
    private EstrategiaImposto estrategiaImposto;

    public CalculadoraImpostos(EstrategiaImposto estrategiaImposto) {
        this.estrategiaImposto = estrategiaImposto;
    }

    public double calcularImposto(double valor) {
        return estrategiaImposto.calcularImposto(valor);
    }
}
