interface Criavel {
    void criar();
}

interface Visualizavel {
    void visualizar();
}

interface Editavel {
    void editar();
}

interface Imprimivel {
    void imprimir();
}

class DocumentoTexto implements Criavel, Visualizavel, Editavel, Imprimivel {
    @Override
    public void criar() {
        System.out.println("Documento de texto criado.");
    }

    @Override
    public void visualizar() {
        System.out.println("Documento de texto visualizado.");
    }

    @Override
    public void editar() {
        System.out.println("Documento de texto editado.");
    }

    @Override
    public void imprimir() {
        System.out.println("Documento de texto impresso.");
    }
}

class DocumentoPDF implements Criavel, Visualizavel, Imprimivel {
    @Override
    public void criar() {
        System.out.println("PDF criado.");
    }

    @Override
    public void visualizar() {
        System.out.println("PDF visualizado.");
    }

    @Override
    public void imprimir() {
        System.out.println("PDF impresso.");
    }
}

public class Main {
    public static void main(String[] args) {
        Criavel documentoPDF = new DocumentoPDF();
        documentoPDF.criar();
        Visualizavel documentoTexto = new DocumentoTexto();
        documentoTexto.visualizar();
        Imprimivel documentoTexto2 = new DocumentoTexto();
        documentoTexto2.imprimir();
    }
}