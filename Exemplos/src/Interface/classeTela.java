package Interface;

import javax.swing.*;
import java.awt.*;

public class classeTela {

    public static void main(String[] args) {
        
        //criação de tela
        JFrame tela = new JFrame("Primeira tela"); // cria telas retangulares vazias
        JFrame tela2 = new JFrame("Segunda tela");
        
        //configurações de tela
        //tela1
        tela.setBounds(100, 100, 600, 400); // seta a localização no monitor e o tamanho da tela
        tela.getContentPane().setBackground(Color.RED); // verifica o a região que pode ter a cor mudada
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ação a ser executado quando este JFrame for fechado
        
        //tela2
        tela2.setBounds(700, 100, 600, 400);
        tela2.getContentPane().setBackground(Color.ORANGE);
        tela2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //fechar a janela sem derrubar o programa todo
        
        //configuração do texto
        //txt tela1
        JLabel texto = new JLabel("Frase indicativa");
        texto.setBounds(100,100,200,30); //mesma localização do jframe e tamanho do texto menor para caber na tela
        tela.add(texto);
        
        //txt tela2
        JLabel texto2 = new JLabel("Frase sugestiva (hehe)");
        texto2.setBounds(700,100,200,30); //mesma localização da tela2
        tela2.add(texto2);

        
        //saida de dados
        tela.setLayout(null); //layout vazio
        tela.setVisible(true); //função para tornar a janela visivel
        tela2.setLayout(null); 
        tela2.setVisible(true);
    }
}
