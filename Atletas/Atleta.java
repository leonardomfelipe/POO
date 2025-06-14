package Atletas;

public class Atleta extends Pessoa {
    private int codigo;

    public Atleta(String nome, String telefone, int codigo) {
        super(nome, telefone);
        this.codigo = codigo;
    }
}