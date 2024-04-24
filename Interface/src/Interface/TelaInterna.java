package Interface;

import javax.swing.*;
import sun.audio.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.*;
import java.io.*;

public class TelaInterna {

    public static void main(String[] args) {

        JFrame tela = new JFrame("Telex");
        JDesktopPane deska = new JDesktopPane();

        final JInternalFrame telinha1 = new JInternalFrame("Tela Interna 1", false, false, false, false);
        telinha1.setBounds(0, 0, 300, 400);
        telinha1.hide();
        telinha1.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);

        final JInternalFrame telinha2 = new JInternalFrame("Tela Interna 2", true, true, true, true);
        telinha2.setBounds(0, 0, 300, 400);
        telinha2.hide();
        telinha2.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);

        JMenuItem t1 = new JMenuItem("Tela 1");
        JMenuItem t2 = new JMenuItem("Tela 2");
        JMenuBar barra = new JMenuBar();
        JMenu menu = new JMenu("Opções");

        barra.add(menu);
        menu.add(t1);
        menu.add(t2);

        t1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                telinha1.show();
            }
        });
        t2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                telinha2.show();
            }
        });

        deska.add(telinha1);
        deska.add(telinha2);
        tela.add(deska);
        tela.setJMenuBar(barra);

        tela.setBounds(10, 10, 800, 600);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}
