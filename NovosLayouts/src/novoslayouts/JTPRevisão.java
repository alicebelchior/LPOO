package novoslayouts;

import javax.swing.*;
import java.awt.*;

public class JTPRevisão {

    public static void main(String[] args) {

        //criação do frame
        JFrame tela = new JFrame("Revisão em paineis");
        JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);
        tela.setBounds(100, 100, 900, 700);
        tabs.setBounds(10, 10, 870, 640);

        //paineis de cada revisão
        //painel 1
        JPanel jtpRevisao1 = new JPanel();
        tabs.add("Revisão 1", jtpRevisao1);

        //painel 2
        JPanel jtpRevisao2 = new JPanel();
        tabs.add("Revisão 2", jtpRevisao2);
        
        //painel 3
        JPanel jtpRevisao3 = new JPanel();
        tabs.add("Revisão 3", jtpRevisao3);
        
        //painel 4
        JPanel jtpRevisao4 = new JPanel();
        tabs.add("Revisão 4", jtpRevisao4);
        
        //painel 5
        JPanel jtpRevisao5 = new JPanel();
        tabs.add("Revisão 5", jtpRevisao5);

        //tornanado a tela visivel 
        tela.add(tabs);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }

}
