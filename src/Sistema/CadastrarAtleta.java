package Sistema;

import Atletas.Atleta;
import java.util.ArrayList;
import java.util.List;

public class CadastrarAtleta {
    private List<Atleta> listaAtletas = new ArrayList<>();

    public void CadastrarAtleta(Atleta novo) throws Exception {
        for (Atleta a : listaAtletas) {
            if (a.getCodigo() == novo.getCodigo()) {
                throw new Exception("Atleta já existente: " + novo.getCodigo());
            }
        }
        listaAtletas.add(novo);
        System.out.println("Atleta adicionado com sucesso!");
    }
}