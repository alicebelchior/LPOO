package Acao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Acao2 {

    public static void main(String[] args) {
        final JFrame tela = new JFrame("Teste");
        final JTextField tex = new JTextField();
        final JTextField tex2 = new JTextField();
        tela.setBounds(20, 20, 800, 600);
        tex.setBounds(50, 50, 300, 35);
        tex2.setBounds(50, 150, 300, 35);
        FocusListener foc = new FocusListener() {
            public void focusGained(FocusEvent e) {
                tex.setBackground(Color.RED);
            }

            public void focusLost(FocusEvent e) {
                tex.setBackground(Color.BLUE);
            }
        };
        tex.addFocusListener(foc);
        tela.setLayout(null);
        tela.add(tex);
        tela.add(tex2);
        tela.setVisible(true);
    }
}
