package Provas;

public enum TipoProva {
    CINCO_KM("5k", 30),
    DEZ_KM("10k", 66.67),
    MEIA_MARATONA("21k", 157.5),
    MARATONA("maratona", 360),;

    private final String descricao;
    private double tempoMaximo;

    TipoProva(String descricao, double tempoMaximo) {
        this.descricao = descricao;
        this.tempoMaximo = tempoMaximo;
    }

    public static TipoProva getTipo(String descricao) {
        for (TipoProva tipo : TipoProva.values()) {
            if (tipo.getDescricao().equals(descricao)) {
                return tipo;
            }
        }
        return null;
    }

    public static double getTempo(String descricao) {
        for (TipoProva tipo : TipoProva.values()) {
            if (tipo.getDescricao().equals(descricao)) {
                return tipo.getTempoMaximo();
            }
        }
        return -1;
    }



    public String getDescricao() {
        return descricao;
    }

    public double getTempoMaximo() {
        return tempoMaximo;
    }
}
