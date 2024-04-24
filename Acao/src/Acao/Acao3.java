package Acao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Acao3 {

    public static void main(String[] args) {
        final JFrame tela = new JFrame("Teste");
        tela.setBounds(20, 20, 800, 600);

        final JTextField tex = new JTextField();
        tex.setBounds(50, 50, 300, 35);

        final JTextField tex2 = new JTextField();
        tex2.setBounds(50, 150, 300, 35);

        KeyListener key = new KeyListener() {
            public void keyPressed(KeyEvent e) {
                tex.setBackground(Color.BLUE);
                tex.setForeground(Color.WHITE);
            }

            public void keyReleased(KeyEvent e) {
                tex.setBackground(Color.BLACK);
                tex.setForeground(Color.YELLOW);
            }

            public void keyTyped(KeyEvent e) {
                JOptionPane.showMessageDialog(null, "Typou rapaz", "Obviedades",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        };

        tex.addKeyListener(key);
        tela.add(tex);
        tela.add(tex2);

        tela.setLayout(null);
        tela.setVisible(true);
    }
}
