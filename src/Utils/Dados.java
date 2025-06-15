package Utils;

import java.io.*;

public class Dados {

    public static void escrever(String caminho, String nomeArquivo, String conteudo) throws IOException {
        if (new File(caminho).mkdirs()) {
            System.out.println("Pasta criada");
        } else {
            System.out.println("Erro ao criar pasta");
        }

        File file = new File(caminho + "/" + nomeArquivo);

        if (file.createNewFile()) {
            System.out.println("Arquivo criado");
        } else {
            System.out.println("Arquivo já existe");
        }

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(conteudo);
        }
    }

    public static String ler(String caminho, String nomeArquivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho + "/" + nomeArquivo))) {
            return br.readLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
