package Percursos;

import Utils.Dados;

import java.io.IOException;

public class Local {
    private final int codigo;
    private final String nome;
    private final String cidade;

    public Local(String nome, String cidade) {
        this.codigo = Dados.next("Locais");
        this.nome = nome;
        this.cidade = cidade;
    }

    public void gravarLocal() throws IOException {
        String conteudo = getCodigo() + ";" + getNome() + ";" + getCidade();
        Dados.escrever("Locais", getCodigo() + ".csv", conteudo);
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCidade() {
        return this.cidade;
    }


}
