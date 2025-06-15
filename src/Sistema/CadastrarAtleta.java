package Sistema;

import Atletas.Atleta;
import Utils.Cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastrarAtleta implements Cadastro, Funcao {
    Scanner scanner = new Scanner(System.in);
    private List<Atleta> listaAtletas = new ArrayList<>();


    @Override
    public void executar() {
        CadastrarAtleta cadastrarAtleta = new CadastrarAtleta();
        cadastrarAtleta.cadastrar();
    }

    @Override
    public void cadastrar() {
        try { //tratamento de exceção da classe cadastrar atleta
            System.out.print("Código (número inteiro): ");
            int codigo = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            Atleta novo = new Atleta(codigo, nome, telefone);
            CadastrarAtleta(novo);

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar atleta: " + e.getMessage());
            scanner.nextLine(); // limpar o buffer se der erro
        }

    }

    public void CadastrarAtleta(Atleta novo) throws Exception {
        for (Atleta a : listaAtletas) {
            if (a.getCodigo() == novo.getCodigo()) {
                throw new Exception("Atleta já existente: " + novo.getCodigo());
            }
        }
        listaAtletas.add(novo);
        System.out.println("Atleta adicionado com sucesso!");
    }
}