package Atletas;

import Utils.Dados;

import java.io.IOException;

public class Atleta extends Pessoa {

    public Atleta(String nome, String telefone, int codigo){
        super(nome, telefone, codigo);
    }

    public void gravarAtleta() throws IOException {
        String conteudo = getNome() + ";" + getTelefone() + ";" + getCodigo();
        Dados.escrever("Atletas", getCodigo() + ".csv", conteudo);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}

