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
                System.out.println("sair - encerrar");
                System.out.println("atleta - cadastrar atleta");
                System.out.println("prova - cadastrar prova");
                // ... outras opções

                String enter = scanner.nextLine();
                if (enter.equalsIgnoreCase("sair")) break;

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
