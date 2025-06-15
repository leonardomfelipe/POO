package Sistema;

import Utils.Dados;

import java.io.IOException;

public class ListarLocais implements Funcao{

    @Override
    public void executar() {
        System.out.println("Listando locais...");
        try {
            Dados.ler("Locais");
        } catch (IOException e) {
            System.err.println("Erro ao listar locais: " + e.getMessage());
        }
    }
}
