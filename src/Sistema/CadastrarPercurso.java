package Sistema;

import Percursos.Percurso;
import Utils.Cadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarPercurso implements Cadastro, Funcao {

    public void executar() {
        CadastrarPercurso cp = new CadastrarPercurso();
        cp.cadastrar();
    }

    public void cadastrar() {
        Scanner sc = new Scanner(System.in);
        //implementar - codigo do percurso pode ser o código +1
        System.out.println("[ === CADASTRO-PERCURSO === ]");
        System.out.println("Digite o nome do percurso: ");
        String nome = sc.nextLine();
        System.out.println("Digite o cidade do percurso: ");
        String cidade = sc.nextLine();
        System.out.println("Digite a distancia do percurso: ");
        double distancia = sc.nextDouble();

        Percurso percurso = new Percurso(nome, distancia, cidade);

        try {
            percurso.gravarPercurso();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
