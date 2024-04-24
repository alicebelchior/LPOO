package Acao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Acao4 {

    public static void main(String[] args) {
        final JFrame tela = new JFrame("Teste");
        tela.setBounds(20, 20, 800, 600);

        final JTextField tex = new JTextField();
        tex.setBounds(50, 50, 300, 35);

        final JTextField tex2 = new JTextField();
        tex2.setBounds(50, 150, 300, 35);

        MouseListener mickey = new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                int contador = e.getClickCount();
                if (contador == 1) {
                    tex.setText("Você deu um clique!");
                } else if (contador == 2) {
                    tex.setText("Você deu um duplo clique!");
                }
            }

            public void mouseEntered(MouseEvent e) {
                tex.setText("O mouse entrou!");
            }

            public void mouseExited(MouseEvent e) {
                tex.setText("O mouse saiu!");
            }

            public void mousePressed(MouseEvent e) {
                tex.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                tex.setBackground(Color.WHITE);
            }
        };

        tex.addMouseListener(mickey);
        tela.add(tex);
        tela.add(tex2);

        tela.setLayout(null);
        tela.setVisible(true);
    }
}
