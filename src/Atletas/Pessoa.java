package Atletas;

public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected int codigo;

    public Pessoa(String nome, String telefone, int codigo){
        this.nome = nome;
        this.telefone = telefone;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

     public int getCodigo(){
        return codigo;
    }
}
