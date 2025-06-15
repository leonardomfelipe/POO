package Provas;

import Utils.Dados;

import java.io.IOException;

public class Prova {
    private int codigo;
    private TipoProva tipo;
    private String percurso;
    private String local;
    private double tempoMaximo;
    private SituacaoProva situacao;
    private int tempoFinalSegundos = 0;
    //atleta inscrito

    public Prova(int codigo, TipoProva tipo, String percurso, String local) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.percurso = percurso;
        this.local = local;
        this.tempoMaximo = tipo.getTempoMaximo();
        this.situacao = SituacaoProva.INSCRITA;
    }

    public void gravarProva() throws IOException {
        String conteudo = getCodigo() + ";" + getTipo() + ";" + getPercurso() + ";" + getLocal() + ";" + getTempoMaximo();
        Dados.escrever("Provas", getCodigo() + ".csv", conteudo);
    }

    public void listarProvas() throws IOException {
        Dados.ler("Provas");
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

    public SituacaoProva getSituacao() {
        return situacao;
    }
    public void setSituacao(SituacaoProva situacao) {
        this.situacao = situacao;
    }
    public void setTempoFinal(int segundos) {
        this.tempoFinalSegundos = segundos;
        this.situacao = SituacaoProva.FINALIZADA;
    }
    public double getPaceMedio(double distanciaKm) {
        if (distanciaKm <= 0) return 0;
        return (tempoFinalSegundos / 60.0) / distanciaKm;
    }
}
