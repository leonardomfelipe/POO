import Sistema.Funcao;
import Sistema.Funcoes;
import Sistema.CadastrarAtleta;
import Atletas.Atleta;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CadastrarAtleta ca = new CadastrarAtleta(); // criou o objeto fora do loop

        while (true) {
            System.out.println("Insira a sua opção:");
            System.out.println("sair - para encerrar o programa.");

            String enter = scanner.nextLine();

            if (enter.equalsIgnoreCase("sair")) {
                break;
            }

            Funcao funcao = Funcoes.encontrarFuncao(enter);

            if (funcao != null) {
                funcao.executar();
            } else {
                System.out.println("Opção inválida.");
            }

            try { //tratamento de exceção da classe cadastrar atleta
                System.out.print("Código (número inteiro): ");
                int codigo = scanner.nextInt();
                scanner.nextLine(); // limpar o buffer

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();

                Atleta novo = new Atleta(codigo, nome, telefone);
                ca.CadastrarAtleta(novo);

            } catch (Exception e) {
                System.out.println("Erro ao cadastrar atleta: " + e.getMessage());
                scanner.nextLine(); // limpar o buffer se der erro
            }
        }
    }
}