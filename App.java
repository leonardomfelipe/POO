import Sistema.Funcao;
import Sistema.Funcoes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Insira a sua opção:");
            System.out.println("sair - para encerrar o programa.");

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
