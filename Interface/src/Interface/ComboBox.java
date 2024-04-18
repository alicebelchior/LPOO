package Interface;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ComboBox {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Combo");
        tela.setBounds(10, 10, 800, 600);
        
        JComboBox comb = new JComboBox();
        comb.setBounds(100, 100, 150, 35);
        
        comb.addItem("Gaúcho");
        comb.addItem("Baiano");
        comb.addItem("Paulista");
        comb.addItem("Carioca");
        
        comb.setEditable(false);
        
        comb.setSelectedIndex(0);
        
        tela.setLayout(null);
        tela.add(comb);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }

}
