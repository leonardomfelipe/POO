package Sistema;

import Provas.Prova;
import Provas.TipoProva;
import Utils.Cadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarProva implements Cadastro, Funcao {
    ArrayList<Prova> listaProvas = new ArrayList<>();

    public void executar() {
        CadastrarProva cp = new CadastrarProva();
        cp.cadastrar();
    }

    public void cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código da prova: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o percurso da prova: ");
        String percurso = sc.nextLine();

        System.out.println("Digite o local da prova: ");
        String local = sc.nextLine();

        System.out.println("Digite o tipo de prova: ");
        String tipo = sc.nextLine();
        TipoProva tipoProva = TipoProva.getTipo(tipo);

        while (tipoProva == null) {
            System.out.println("Tipo inválido");
            System.out.println("Digite o tipo de prova: ");
            tipo = sc.nextLine();
            tipoProva = TipoProva.getTipo(tipo);
        }

        Prova prova = new Prova(codigo, tipoProva, percurso, local);
        listaProvas.add(prova);
    }
}
