package Provas;

import Percursos.Local;
import Percursos.Percurso;

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








}
