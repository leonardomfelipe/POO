package Interface;
import javax.swing.*;

public class TelaCadastrarLocal extends JFrame {
    public TelaCadastrarLocal() {
        setTitle("Cadastrar Local");
        setSize(300, 200);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel lblNome = new JLabel("Nome do Local:");
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
            JOptionPane.showMessageDialog(this, "Local cadastrado: " + nome);
            txtNome.setText("");
        });
    }
}
