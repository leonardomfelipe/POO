package Provas;

import java.util.List;

public class Prova {
    private int codigo;
    private TipoProva tipo;
    private String percurso;
    private String local;
    private double tempoMaximo;
    private SituacaoProva situacao;
    //atleta inscrito

    public Prova(int codigo, TipoProva tipo, String percurso, String local) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.percurso = percurso;
        this.local = local;
        this.tempoMaximo = tipo.getTempoMaximo();
        this.situacao = SituacaoProva.INSCRITA;
    }

    public int getCodigo() {
        return codigo;
    }

    public SituacaoProva getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoProva situacao) {
        this.situacao = situacao;
    }
}
