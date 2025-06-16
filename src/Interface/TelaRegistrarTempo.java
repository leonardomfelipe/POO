package Interface;
import javax.swing.*;

public class TelaRegistrarTempo extends JFrame {

    public TelaRegistrarTempo() {
        setTitle("Registrar Tempo Final");
        setSize(400, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel lblCodigo = new JLabel("Código da Prova:");
        lblCodigo.setBounds(30, 30, 120, 25);
        add(lblCodigo);

        JTextField txtCodigo = new JTextField();
        txtCodigo.setBounds(160, 30, 180, 25);
        add(txtCodigo);

        JLabel lblTempo = new JLabel("Tempo (segundos):");
        lblTempo.setBounds(30, 70, 120, 25);
        add(lblTempo);

        JTextField txtTempo = new JTextField();
        txtTempo.setBounds(160, 70, 180, 25);
        add(txtTempo);

        JButton btnSalvar = new JButton("Registrar");
        btnSalvar.setBounds(140, 130, 120, 30);
        add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            String codigoStr = txtCodigo.getText();
            String tempoStr = txtTempo.getText();

            if (!codigoStr.isEmpty() && !tempoStr.isEmpty()) {
                try {
                    int codigo = Integer.parseInt(codigoStr);
                    int tempo = Integer.parseInt(tempoStr);
                    JOptionPane.showMessageDialog(this, "Tempo registrado com sucesso para a prova " + codigo);
                    txtCodigo.setText("");
                    txtTempo.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Insira valores numéricos válidos.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
            }
        });
    }
}
