package Provas;

import Utils.Dados;

import java.io.IOException;

public class Prova {
    private int codigo;
    private TipoProva tipo;
    private String percurso;
    private String local;
    private double tempoMaximo;
    //atleta inscrito

    public Prova(int codigo, TipoProva tipo, String percurso, String local) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.percurso = percurso;
        this.local = local;
        this.tempoMaximo = tipo.getTempoMaximo();
    }

    public void gravarProva() throws IOException {
        String conteudo = getCodigo() + ";" + getTipo() + ";" + getPercurso() + ";" + getLocal() + ";" + getTempoMaximo();
        Dados.escrever("Provas", getCodigo() + ".csv", conteudo);
    }

    public void listarProvas() throws IOException {
        Dados.ler("Provas", "listaProvas.csv");
    }

    public int getCodigo() {
        return codigo;
    }

    public TipoProva getTipo() {
        return tipo;
    }

    public String getPercurso() {
        return percurso;
    }

    public String getLocal() {
        return local;
    }

    public double getTempoMaximo() {
        return tempoMaximo;
    }


}
