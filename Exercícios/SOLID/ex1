import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivos {
    private String nomeArquivo;

    public LeitorArquivos(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String[] lerArquivo() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            StringBuilder conteudo = new StringBuilder();
            String linha;
            while ((linha = br.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
            return conteudo.toString().split("\\s+");
        }
    }
}

public class ProcessadorDados {
    public int contarLinhas(String[] conteudo) {
        return conteudo.length;
    }

    public int contarPalavras(String[] conteudo) {
        int totalPalavras = 0;
        for (String linha : conteudo) {
            totalPalavras += linha.split(" ").length;
        }
        return totalPalavras;
    }

    public int contarCaracteres(String[] conteudo) {
        int totalCaracteres = 0;
        for (String linha : conteudo) {
            totalCaracteres += linha.length();
        }
        return totalCaracteres;
    }
}