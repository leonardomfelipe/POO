package Interface;
import javax.swing.*;

public class TelaListarProvas extends JFrame {
    public TelaListarProvas() {
        setTitle("Lista de Provas");
        setSize(300, 200);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JTextArea area = new JTextArea("Prova 1\nProva 2\n...");
        area.setEditable(false);
        add(new JScrollPane(area));
    }
}
