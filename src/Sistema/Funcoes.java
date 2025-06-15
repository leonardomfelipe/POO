package Sistema;

public enum Funcoes {
    ENCERRAR(new EncerrarPrograma(), "sair"),
    CADASTRAR_PROVA((Funcao) new CadastrarProva(), "cadastrar prova");

    private final Funcao funcao;
    private final String comando;

    Funcoes(Funcao funcao, String comando) {
        this.funcao = funcao;
        this.comando = comando;
    }

    public static Funcao encontrarFuncao(String comando) {
        for (Funcoes f : Funcoes.values()) {
            if (f.getComando().equals(comando)) {
                return f.getFuncao();
            }
        }
        return null;
    }

    public Funcao getFuncao() {
        return this.funcao;
    }

    public String getComando() {
        return this.comando;
    }


}
