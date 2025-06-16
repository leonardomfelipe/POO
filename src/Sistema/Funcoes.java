package Sistema;

import java.lang.classfile.instruction.NewMultiArrayInstruction;

public enum Funcoes {
    ENCERRAR(new EncerrarPrograma(), "sair"),
    CADASTRAR_PROVA(new CadastrarProva(), "prova"),
    CADASTRAR_LOCAL(new CadastrarLocal(), "local"),
    CADASTRAR_ATLETA(new CadastrarAtleta(), "atleta"),
    CADASTRAR_PERCURSO(new CadastrarPercurso(), "percurso"),
    LISTAR_ATLETAS(new ListarAtletas(), "lista atletas"),
    LISTAR_LOCAIS(new ListarLocais(), "lista locais"),
    LISTAR_PROVAS(new ListarProvas(), "lista provas");

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
