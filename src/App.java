import Sistema.CadastrarAtleta;
import Sistema.Funcao;
import Sistema.Funcoes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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