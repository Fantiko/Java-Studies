import javax.swing.*;
import java.awt.*;


public class MinhaTela extends JFrame {

    public MinhaTela() {
        setTitle("Minha Tela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 100);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));

        JLabel l1 = new JLabel("No..");
        JLabel l2 = new JLabel("Telefone:");

        JTextField texto1 = new JTextField(12);
        JTextField texto2 = new JTextField(12);

        JButton botao = new JButton("salvar");

        add(l1);
        add(texto1);
        add(l2);
        add(texto2);
        add(botao, BorderLayout.SOUTH);
        setVisible(true);
    }
}
