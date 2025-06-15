package Sistema;

import Percursos.Local;
import Utils.Cadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarLocal implements Cadastro, Funcao {
    ArrayList<Local> listaLocais = new ArrayList<>();

    public void executar() {
        CadastrarLocal cl = new CadastrarLocal();
        cl.cadastrar();
    }

    public void cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do local: ");
        String nome = sc.nextLine();
        System.out.println("Digite a cidade do local: ");
        String cidade = sc.nextLine();

        Local novo = new Local(nome, cidade);
        listaLocais.add(novo);
    }
}
