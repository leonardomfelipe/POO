package Atletas;

public class Atleta extends Pessoa {

    public Atleta(String nome, String telefone, int codigo){
        super(nome, telefone, codigo);
    }

    public int getCodigo() {
        return codigo;
    }
}

