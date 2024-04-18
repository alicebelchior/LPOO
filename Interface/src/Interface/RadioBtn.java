package Interface;

import java.awt.event.*;
import javax.swing.*;

public class RadioBtn {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Radios!");
        tela.setBounds(10, 10, 800, 600);
        tela.setLayout(null);
        
        final JRadioButton designer = new JRadioButton("Eu sou WebDesigner!");
        final JRadioButton programador = new JRadioButton("Eu sou programador Java!");
        
        designer.setBounds(20, 20, 250, 35);
        programador.setBounds(20, 60, 250, 35);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(designer);
        grupo.add(programador);
        
        programador.setSelected(true);
        
        JButton botao = new JButton("Teste!");
        botao.setBounds(20, 150, 250, 35);
        botao.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                if (designer.isSelected()) {
                    JOptionPane.showMessageDialog(null, 
                    "Eu faço site colorido com logo cor lilás.",
                    "Homem de rosa, o que é que você faz?",
                    JOptionPane.INFORMATION_MESSAGE);
                }
                if (programador.isSelected()) {
                    JOptionPane.showMessageDialog(null, 
                    "Escrevo código-fonte que assusta o satanás.",
                    "Homem de preto, o que é que você faz?",
                    JOptionPane.INFORMATION_MESSAGE);
                }               
            }
            
});
        
        tela.add(botao);
        tela.add(designer);
        tela.add(programador);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}
