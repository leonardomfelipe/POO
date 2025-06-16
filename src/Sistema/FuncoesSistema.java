package Sistema;

import Atletas.Atleta;
import Percursos.Local;
import Provas.Prova;
import Provas.TipoProva;
import Utils.Dados;
import Utils.Repositorio;

import java.io.IOException;
import java.util.List;

public class FuncoesSistema {
    public static void carregarDadosIniciais() {
        try {
            List<String> linhasAtletas = Dados.lerTodasLinhas("Atletas", "listaAtletas.csv");

             for (String linha : linhasAtletas) {
                String[] partes = linha.split(";");
                String nome = partes[0];
                String telefone = partes[1];
                int codigo = Integer.parseInt(partes[2]);

                Atleta atleta = new Atleta(nome, telefone, codigo);
                Repositorio.atletas.adicionar(atleta);
             }
           
        
        List<String> linhasLocais = Dados.lerTodasLinhas("Percursos", "listaLocais.csv");

        for (String linha : linhasLocais) {
            String[] partes = linha.split(",");
            int codigo = Integer.parseInt(partes[0]);
            String nome = partes[1];
            String cidade = partes[2];
            
            
            Local local = new Local(nome, cidade);
            Repositorio.locais.adicionar(local);
        }

        List<String> linhasProvas = Dados.lerTodasLinhas("Provas", "listaProvas.csv");

        for (String linha : linhasProvas) {
            String[] partes = linha.split(";");
            int codigo = Integer.parseInt(partes[0]);
            TipoProva tipo = TipoProva.valueOf(partes[1]);
            String percurso = partes[2];
            String local = partes[3];
        

            Prova prova = new Prova(codigo, tipo, percurso, local);
            Repositorio.provas.add(prova);
        }

        System.out.println("[ === PROVAS CARREGADAS === ]");
        for (Prova p : Repositorio.provas) {
            System.out.println(p);
        }

        System.out.println("[ === ATLETAS CARREGADOS === ]");
        for (Atleta a : Repositorio.atletas.listarTodos()) {
            System.out.println(a);
        }

        System.out.println("[ === LOCAIS CARREGADOS === ]");
        for (Local l : Repositorio.locais.listarTodos()) {
            System.out.println(l);
        }
        
        } catch (IOException e) {
            System.out.println("Erro ao carregar dados iniciais: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao processar dados: " + e.getMessage());
        }

    }
}
