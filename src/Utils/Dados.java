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
            fw.append(conteudo);
            fw.append("\n");
        }
    }

    public static void ler(String caminho) throws IOException {
        File pasta = new File(caminho);

        if(!pasta.exists()){
            System.out.println("Nenhum arquivo encontrado.");
        }

        File[] arquivos = pasta.listFiles();

        if(arquivos != null && arquivos.length > 0){
            for (File arquivo : arquivos){
                try (BufferedReader br = new BufferedReader(new FileReader( arquivo))) {
                    System.out.println(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException("Erro ao ler arquivo: " + arquivo.getName(), e);
                }
            }
        }
        System.out.println("Nenhum arquivo encontrado.");
    }

    public static int next(String caminho) {
        File pasta = new File(caminho);
        File[] arquivo = pasta.listFiles();
        int contador = 0;
        if (arquivo != null) {
            for (File file : arquivo) {
                if (file.isFile()) {
                    String nomeArquivo = file.getName().replace(".csv", "");
                    if (Integer.parseInt(nomeArquivo) > contador) {
                        contador = Integer.parseInt(nomeArquivo);
                    }
                }
            }

        } else {
            System.out.println("Não foi possível listar os arquivos da pasta.");
        }

        return contador + 1;
    }

}
