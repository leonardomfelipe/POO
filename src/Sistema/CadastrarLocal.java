package Sistema;

import Percursos.Local;
import Utils.Cadastro;

import java.util.Scanner;

public class CadastrarLocal implements Cadastro {
    public void cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do local: ");
        String nome = sc.nextLine();
        System.out.println("Digite a cidade do local: ");
        String cidade = sc.nextLine();

        Local local = new Local(nome, cidade);
    }
}
