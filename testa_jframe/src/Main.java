import javax.swing.JFrame;
import javax.swing.JButton;
import  javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        //System.out.println(JFrame.EXIT_ON_CLOSE);

        JFrame minhatela = new JFrame("ola mundo");
        JButton botao = new JButton("ok");
        JTextField texto = new JTextField();
        FlowLayout fl = new FlowLayout();



        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = texto.getText();
                System.out.println(text);
            }
        });

        texto.setColumns(10);
        minhatela.setLayout(fl);
        minhatela.add(botao);
        minhatela.add(texto);

        minhatela.setSize(300,300);
        minhatela.setVisible(true);
        minhatela.setLocationRelativeTo(null);
        minhatela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
