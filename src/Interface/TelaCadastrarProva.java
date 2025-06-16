package Interface;
import javax.swing.*;

public class TelaCadastrarProva extends JFrame {

    public TelaCadastrarProva() {
        setTitle("Cadastrar Prova");
        setSize(400, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(30, 30, 100, 25);
        add(lblCodigo);

        JTextField txtCodigo = new JTextField();
        txtCodigo.setBounds(130, 30, 200, 25);
        add(txtCodigo);

        JLabel lblLocal = new JLabel("Local:");
        lblLocal.setBounds(30, 70, 100, 25);
        add(lblLocal);

        JTextField txtLocal = new JTextField();
        txtLocal.setBounds(130, 70, 200, 25);
        add(txtLocal);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(130, 120, 100, 30);
        add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            String codigo = txtCodigo.getText();
            String local = txtLocal.getText();

            if (!codigo.isEmpty() && !local.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Prova cadastrada! Código: " + codigo);
                txtCodigo.setText("");
                txtLocal.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
            }
        });
    }
}
