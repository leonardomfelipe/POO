package Atletas;

public class Atleta extends Pessoa {
    private int codigo;

    public Atleta(int codigo, String nome, String telefone){
        super(nome, telefone);
        this.codigo = codigo;
    }
    public int getCodigo() {
        return this.codigo;
    }
}

