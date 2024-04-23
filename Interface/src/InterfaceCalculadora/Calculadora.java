package InterfaceCalculadora;

import javax.swing.*;
import java.awt.*;

public class Calculadora {
    public static void main(String[] args) {
        //Criação da calculadora
        JFrame calc = new JFrame(); 
        
        //configuração da forma da calculadora
        calc.setBounds(100, 100, 300, 350);
        calc.setDefaultCloseOperation(3); //JFrame.EXIT_ON_CLOSE = 3     
        
        //configuração da tela de resultado da calculadora
        JTextField result = new JTextField("0");
        result.setBounds(10,10,257,50);
        calc.add(result);
        
        //Configuração dos botões
        //1ª linha
        JToggleButton off = new JToggleButton("OFF");
        off.setBounds(10, 70, 60, 40);
        off.setBackground(Color.LIGHT_GRAY); //cor da do fundo do botão
        off.setForeground(Color.BLACK); //cor da letra do texto do botão
        off.setToolTipText("Botão selecionado");
        calc.add(off);
        
        JButton del = new JButton("DEL");
        del.setBounds(75, 70, 60, 40);
        del.setBackground(Color.LIGHT_GRAY);
        del.setForeground(Color.BLACK);
        del.setToolTipText("Botão selecionado");
        calc.add(del);
        
        JButton ac = new JButton("AC");
        ac.setBounds(140, 70, 60, 40);
        ac.setBackground(Color.LIGHT_GRAY);
        ac.setForeground(Color.BLACK);
        ac.setToolTipText("Botão selecionado");
        calc.add(ac);
        
        JButton divide = new JButton("/");
        divide.setBounds(205, 70, 60, 40);
        divide.setBackground(Color.LIGHT_GRAY);
        divide.setForeground(Color.BLACK);
        divide.setToolTipText("Botão selecionado");
        calc.add(divide);
        
        //2ª linha
        JButton sete = new JButton("7");
        sete.setBounds(10, 115, 60, 40);
        sete.setBackground(Color.LIGHT_GRAY); 
        sete.setForeground(Color.BLACK); 
        sete.setToolTipText("Botão selecionado");
        calc.add(sete);
        
        JButton oito = new JButton("8");
        oito.setBounds(75, 115, 60, 40);
        oito.setBackground(Color.LIGHT_GRAY);
        oito.setForeground(Color.BLACK);
        oito.setToolTipText("Botão selecionado");
        calc.add(oito);
        
        JButton nove = new JButton("9");
        nove.setBounds(140, 115, 60, 40);
        nove.setBackground(Color.LIGHT_GRAY);
        nove.setForeground(Color.BLACK);
        nove.setToolTipText("Botão selecionado");
        calc.add(nove);
       
        JButton multiplica = new JButton("*");
        multiplica.setBounds(205, 115, 60, 40);
        multiplica.setBackground(Color.LIGHT_GRAY);
        multiplica.setForeground(Color.BLACK);
        multiplica.setToolTipText("Botão selecionado");
        calc.add(multiplica);
        
        //linha 3
        JButton quatro = new JButton("4");
        quatro.setBounds(10, 160, 60, 40);
        quatro.setBackground(Color.LIGHT_GRAY); 
        quatro.setForeground(Color.BLACK); 
        quatro.setToolTipText("Botão selecionado");
        calc.add(quatro);
        
        JButton cinco = new JButton("5");
        cinco.setBounds(75, 160, 60, 40);
        cinco.setBackground(Color.LIGHT_GRAY);
        cinco.setForeground(Color.BLACK);
        cinco.setToolTipText("Botão selecionado");
        calc.add(cinco);
        
        JButton seis = new JButton("6");
        seis.setBounds(140, 160, 60, 40);
        seis.setBackground(Color.LIGHT_GRAY);
        seis.setForeground(Color.BLACK);
        seis.setToolTipText("Botão selecionado");
        calc.add(seis);
       
        JButton menos = new JButton("-");
        menos.setBounds(205, 160, 60, 40);
        menos.setBackground(Color.LIGHT_GRAY);
        menos.setForeground(Color.BLACK);
        menos.setToolTipText("Botão selecionado");
        calc.add(menos);
        
        //4ª linha
        JButton um = new JButton("1");
        um.setBounds(10, 205, 60, 40);
        um.setBackground(Color.LIGHT_GRAY); 
        um.setForeground(Color.BLACK); 
        um.setToolTipText("Botão selecionado");
        calc.add(um);
        
        JButton dois = new JButton("2");
        dois.setBounds(75, 205, 60, 40);
        dois.setBackground(Color.LIGHT_GRAY);
        dois.setForeground(Color.BLACK);
        dois.setToolTipText("Botão selecionado");
        calc.add(dois);
        
        JButton tres = new JButton("3");
        tres.setBounds(140, 205, 60, 40);
        tres.setBackground(Color.LIGHT_GRAY);
        tres.setForeground(Color.BLACK);
        tres.setToolTipText("Botão selecionado");
        calc.add(tres);
       
        JButton mais = new JButton("+");
        mais.setBounds(205, 205, 60, 40);
        mais.setBackground(Color.LIGHT_GRAY);
        mais.setForeground(Color.BLACK);
        mais.setToolTipText("Botão selecionado");
        calc.add(mais);
        
        //5ª linha
        JButton zero = new JButton("0");
        zero.setBounds(10, 250, 60, 40);
        zero.setBackground(Color.LIGHT_GRAY); 
        zero.setForeground(Color.BLACK); 
        zero.setToolTipText("Botão selecionado");
        calc.add(zero);
        
        JButton doubleZero = new JButton("00");
        doubleZero.setBounds(75, 250, 60, 40);
        doubleZero.setBackground(Color.LIGHT_GRAY);
        doubleZero.setForeground(Color.BLACK);
        doubleZero.setToolTipText("Botão selecionado");
        calc.add(doubleZero);
        
        JButton ponto = new JButton(".");
        ponto.setBounds(140, 250, 60, 40);
        ponto.setBackground(Color.LIGHT_GRAY);
        ponto.setForeground(Color.BLACK);
        ponto.setToolTipText("Botão selecionado");
        calc.add(ponto);
       
        JButton igual = new JButton("=");
        igual.setBounds(205, 250, 60, 40);
        igual.setBackground(Color.LIGHT_GRAY);
        igual.setForeground(Color.BLACK);
        igual.setToolTipText("Botão selecionado");
        calc.add(igual);
        
        //saida de dados
        calc.setLayout(null);
        calc.setVisible(true);
    }
    
}
