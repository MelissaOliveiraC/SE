interface FormaRetangular {
    void setLargura(int largura);
    void setAltura(int altura);
    int calcularArea();
}

class Retangulo implements FormaRetangular {
    protected int largura;
    protected int altura;

    @Override
    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcularArea() {
        return largura * altura;
    }
}

class Quadrado implements FormaRetangular {
    private int lado;

    @Override
    public void setLargura(int lado) {
        this.lado = lado;
    }

    @Override
    public void setAltura(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcularArea() {
        return lado * lado;
    }
}

public class Main {
    public static void main(String[] args) {
        FormaRetangular retangulo = new Retangulo();
        retangulo.setLargura(5);
        retangulo.setAltura(10);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        FormaRetangular quadrado = new Quadrado();
        quadrado.setLargura(5);
        quadrado.setAltura(5);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
    }
}
