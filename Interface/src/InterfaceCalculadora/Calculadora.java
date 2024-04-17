package InterfaceCalculadora;

import javax.swing.*;
import java.awt.*;

public class Calculadora {
    public static void main(String[] args) {
        //Criação da calculadora
        JFrame calc = new JFrame(); 
        
        //configuração da forma da calculadora
        calc.setBounds(100, 100, 300, 400);
        calc.setDefaultCloseOperation(3); //JFrame.EXIT_ON_CLOSE = 3        
        
        //configuração da tela de resultado da calculadora
        JLabel result = new JLabel("0");
        
        
        //saida de dados
        calc.setLayout(null);
        calc.setVisible(true);
    }
    
}
