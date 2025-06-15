package Interface;
import javax.swing.*;

public class TelaListarAtletas extends JFrame {
    public TelaListarAtletas() {
        setTitle("Lista de Atletas");
        setSize(300, 200);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JTextArea area = new JTextArea("Atleta 1\nAtleta 2\n...");
        area.setEditable(false);
        add(new JScrollPane(area));
    }
}
