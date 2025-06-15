package Sistema;

import Utils.Dados;

import java.io.IOException;

public class ListarProvas implements Funcao{

    @Override
    public void executar() {
        System.out.println("Listando provas...");
        try {
            Dados.ler("Provas");
        } catch (IOException e) {
            System.err.println("Erro ao listar provas: " + e.getMessage());
        }
    }
}
