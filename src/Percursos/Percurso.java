package Percursos;

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
}
