package Interface;

import javax.swing.*;
import java.awt.*;

public class classeTela {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Primeira tela"); // cria telas retangulares vazias
        tela.setBounds(100, 100, 600, 400); // seta a localização e o tamanho da tela
        tela.getContentPane().setBackground(Color.RED); // verifica o a região que pode ter a cor mudada
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ação a ser executado quando este JFrame for fechado
        tela.setLayout(null); //layout vazio
        tela.setVisible(true); //função para tornar a janela visivel
    }
}
