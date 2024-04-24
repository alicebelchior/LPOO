package Acao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Acao1 {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Teste");
        tela.setBounds(10, 10, 600, 400);

        JButton botao = new JButton("Aperte aqui");
        botao.setBounds(100, 100, 150, 35);

        JButton botao2 = new JButton("Aperte aqui 2");
        botao2.setBounds(100, 200, 150, 35);

        ActionListener ac = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ("botao1".equals(e.getActionCommand())) {
                    JOptionPane.showMessageDialog(null, "Apertou o botão!", "Olá!", JOptionPane.INFORMATION_MESSAGE);
                }
                if ("botao2".equals(e.getActionCommand())) {
                    JOptionPane.showMessageDialog(null, "Apertou o botão 2!", "Olá!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        };

        botao.setActionCommand("botao1");
        botao.addActionListener(ac);
        botao2.setActionCommand("botao2");
        botao2.addActionListener(ac);

        tela.setLayout(null);
        tela.add(botao);
        tela.add(botao2);

        tela.setVisible(true);

    }
}
