package Interface;
import javax.swing.*;

public class TelaCadastrarPercurso extends JFrame {
    public TelaCadastrarPercurso() {
        setTitle("Cadastrar Percurso");
        setSize(300, 200);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel lblNome = new JLabel("Nome Percurso:");
        lblNome.setBounds(20, 30, 120, 25);
        add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(140, 30, 120, 25);
        add(txtNome);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(90, 80, 100, 30);
        add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            String nome = txtNome.getText();
            JOptionPane.showMessageDialog(this, "Percurso cadastrado: " + nome);
            txtNome.setText("");
        });
    }
}
