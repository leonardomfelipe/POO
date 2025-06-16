import Sistema.CadastrarAtleta;
import Sistema.Funcao;
import Sistema.Funcoes;
import java.util.Scanner;
import Interface.TelaPrincipal;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[ MODO DE EXECUÇÃO ]");
        System.out.println("Digite 'grafico' para abrir a interface");
        System.out.println("Digite 'texto' para usar o menu no console");

        String modo = scanner.nextLine().trim();

        if (modo.equalsIgnoreCase("grafico")) {
            new TelaPrincipal().setVisible(true);
        } else {

        while (true) {
            System.out.println("[ === MENU-OPÇÕES === ]");
            System.out.println("Insira a sua opção:");
            System.out.println("sair - para encerrar o programa.");
            System.out.println("atleta - para cadastrar atleta");
            System.out.println("local - para cadastrar local.");
            System.out.println("percurso - para cadastrar percurso.");
            System.out.println("prova - para cadastrar prova.");
            System.out.println("lista atletas - para listar atletas cadastrados.");
            System.out.println("lista locais - para listar locais cadastrados.");
            System.out.println("lista provas - para listar provas cadastradas.");

            String enter = scanner.nextLine();
            Funcao funcao = Funcoes.encontrarFuncao(enter);

                if (funcao != null) {
                    funcao.executar();
                } else {
                    System.out.println("Opção inválida.");
                }
            }
        }
    }
}