package Interface;

import javax.swing.*;

public class ScrollPane {

    public static void main(String[] args) {
        JTextField tex = new JTextField();
        tex.setBounds(0, 0, 300, 700);
        
        JFrame tela = new JFrame();
        tela.setBounds(0, 0, 800, 600);
        
        JScrollPane scrots = new JScrollPane(tex);
        scrots.setBounds(100, 100, 300, 300);
        
        tela.add(scrots);
        
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);
        tela.setVisible(true);
    }

}
