package InterfaceInicial;

import javax.swing.*;
import java.awt.*;

public class interfaceInicial {
    
    /*
    Criar 3 janelas que apareçam uma ao lado da outra na tela, cada uma delas deve ter uma cor diferente e um título diferente. 
    A que aparecer por último deve encerrar o programa, as outras duas não devem encerrar o programa
    */
    
    public static void main(String[] args) {
        //criação das telas
        JFrame tela1 = new JFrame("Tela 1");
        JFrame tela2 = new JFrame("Tela 2");
        JFrame tela3 = new JFrame("Tela 3");
        
        //configuração das telas
        //tela1
        tela1.setBounds(100, 100, 400, 400);
        tela1.getContentPane().setBackground(Color.MAGENTA);
        tela1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        //tela2
        tela2.setBounds(500, 100, 400, 400);
        tela2.getContentPane().setBackground(Color.ORANGE);
        tela2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //tela3
        tela3.setBounds(900, 100, 400, 400);
        tela3.getContentPane().setBackground(Color.RED);
        tela3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //configuração do texto
        //tela1
        JLabel txt1 = new JLabel("Frase um da tela 1");
        txt1.setBounds(10, 100, 200, 50);
        tela1.add(txt1);
        
        //tela2
        JLabel txt2 = new JLabel("Frase dois da tela 2");
        txt2.setBounds(10, 100, 200, 50);
        tela2.add(txt2);
        
        //tela3
        JLabel txt3 = new JLabel("Frase três da tela 3");
        txt3.setBounds(10, 100, 200, 50);
        tela3.add(txt3);
        
        //saida de dados
        tela1.setLayout(null); 
        tela1.setVisible(true); 
        tela2.setLayout(null);
        tela2.setVisible(true);
        tela3.setLayout(null);
        tela3.setVisible(true);
        
    }

}
