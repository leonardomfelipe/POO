package Interface;

import javax.swing.*;
import java.awt.*;

public class TelaCadastrarAtleta extends JFrame {

    public TelaCadastrarAtleta() {
        setTitle("Cadastrar Atleta");
        setSize(350, 200);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(30, 30, 80, 25);
        add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(100, 30, 180, 25);
        add(txtNome);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(100, 80, 100, 30);
        add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            String nome = txtNome.getText();
            if (!nome.isEmpty()) {
                // Aqui você pode chamar a classe do sistema para registrar o atleta
                // Por exemplo: CadastrarAtleta.executar(nome);
                JOptionPane.showMessageDialog(this, "Atleta cadastrado: " + nome);
                txtNome.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Digite um nome válido.");
            }
        });
    }
}
