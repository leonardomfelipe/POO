package Percursos;

import Utils.Dados;

import java.io.IOException;

public class Percurso {
    private final int codigo;
    private final String nome;
    private final double distancia;
    private final String cidade;

    public Percurso(String nome, double distancia, String cidade) {
        this.codigo = 0;
        this.nome = nome;
        this.distancia = distancia;
        this.cidade = cidade;
    }

    public void gravarPercurso() throws IOException {
        String conteudo = getCodigo() + ";" + getNome() + ";" + getDistancia() + ";" + getCidade();
        Dados.escrever("Percursos", getCodigo() + ".csv", conteudo);
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public String getCidade() {
        return this.cidade;
    }
}
