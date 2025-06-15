package Interface;
import javax.swing.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        setTitle("Sistema de Gestão de Provas");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton btnCadastrarAtleta = new JButton("Cadastrar Atleta");
        btnCadastrarAtleta.setBounds(50, 30, 150, 30);
        add(btnCadastrarAtleta);

        JButton btnCadastrarProva = new JButton("Cadastrar Prova");
        btnCadastrarProva.setBounds(210, 30, 150, 30);
        add(btnCadastrarProva);

        JButton btnCadastrarLocal = new JButton("Cadastrar Local");
        btnCadastrarLocal.setBounds(50, 70, 150, 30);
        add(btnCadastrarLocal);

        JButton btnCadastrarPercurso = new JButton("Cadastrar Percurso");
        btnCadastrarPercurso.setBounds(210, 70, 150, 30);
        add(btnCadastrarPercurso);

        JButton btnListarAtletas = new JButton("Listar Atletas");
        btnListarAtletas.setBounds(50, 110, 150, 30);
        add(btnListarAtletas);

        JButton btnListarProvas = new JButton("Listar Provas");
        btnListarProvas.setBounds(210, 110, 150, 30);
        add(btnListarProvas);

        JButton btnRegistrarTempo = new JButton("Registrar Tempo");
        btnRegistrarTempo.setBounds(50, 150, 150, 30);
        add(btnRegistrarTempo);

        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(210, 150, 150, 30);
        add(btnSair);

        // Ações dos botões
        btnSair.addActionListener(e -> System.exit(0));

         // Listeners para os botões
        btnCadastrarAtleta.addActionListener(e -> new TelaCadastrarAtleta().setVisible(true));
        btnCadastrarProva.addActionListener(e -> new TelaCadastrarProva().setVisible(true));
        btnRegistrarTempo.addActionListener(e -> new TelaRegistrarTempo().setVisible(true));
        btnCadastrarLocal.addActionListener(e -> new TelaCadastrarLocal().setVisible(true));
        btnCadastrarPercurso.addActionListener(e -> new TelaCadastrarPercurso().setVisible(true));
        btnListarAtletas.addActionListener(e -> new TelaListarAtletas().setVisible(true));
        btnListarProvas.addActionListener(e -> new TelaListarProvas().setVisible(true));


        btnSair.addActionListener(e -> System.exit(0));
}
}