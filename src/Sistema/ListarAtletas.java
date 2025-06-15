package Sistema;

import Utils.Dados;

import java.io.IOException;

public class ListarAtletas implements Funcao{

    @Override
    public void executar() {
        System.out.println("Listando atletas...");
        try {
            Dados.ler("Atletas");
        } catch (IOException e) {
            System.err.println("Erro ao listar atletas: " + e.getMessage());
        }
    }

}
