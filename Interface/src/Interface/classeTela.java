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
        texto.setBounds(100, 100, 200, 30); //mesma localização do jframe e tamanho do texto menor para caber na tela
        tela.add(texto);

        //txt tela2
        JLabel texto2 = new JLabel("Frase sugestiva (hehe)");
        texto2.setBounds(100, 100, 200, 30); //mesma localização da tela2
        tela2.add(texto2);

        //config do botão
        //btn1
        JButton botao = new JButton("Pressione aqui");
        botao.setBounds(100, 200, 200, 30);//(x, y)
        botao.setBackground(Color.GREEN);
        botao.setForeground(Color.BLUE);  //setForeground determina a cor da letra do texto do botão
        botao.setToolTipText("Um exemplo de ToolTip"); //ToolTipText seta o texto que aparece quando passamos o mouse sobre o botao
        tela.add(botao);

        //btn2
        JButton botao2 = new JButton("Põe o dedo aqui, senao vai fechar");
        botao2.setBounds(100, 100, 300, 50);
        botao2.setBackground(Color.BLUE);
        botao2.setForeground(Color.GRAY);
        tela2.add(botao2);
        
        //config botao ativado
        //btn ativ1
        JToggleButton toglebotao = new JToggleButton("Botão ativado");
        toglebotao.setBounds(300, 200, 200, 30);
        toglebotao.setBackground(Color.GREEN);
        toglebotao.setForeground(Color.BLUE);
        toglebotao.setToolTipText("Um exemplo de ToolTip");
        tela.add(toglebotao);
        
        //btn ativ2
        JToggleButton toglebotao2 = new JToggleButton("Botão ativado");
        toglebotao2.setBounds(200, 200, 200, 30);
        toglebotao2.setBackground(Color.BLUE);
        toglebotao2.setForeground(Color.GRAY);
        toglebotao2.setToolTipText("Um exemplo de ToolTip");
        tela2.add(toglebotao2);

        //caixa de texto
        //cx txt1
        JTextField caixa = new JTextField();
        caixa.setBounds(100, 300, 200, 30);
        caixa.setBackground(Color.WHITE);
        caixa.setForeground(Color.BLUE);//letra do txt
        tela.add(caixa);

        //cx txt2
        JTextField caixa2 = new JTextField();
        caixa2.setBounds(100, 300, 200, 30);
        caixa2.setBackground(Color.GRAY);
        caixa2.setForeground(Color.BLUE);
        tela2.add(caixa2);

        //config do ícone
        //icon1
        Icon imagem = new ImageIcon("alice.jpg");
        JButton btn = new JButton("alice.jpg");
        btn.setIcon(imagem);
        btn.setBounds(300, 300, 100, 100);
        tela.add(btn);
        tela.revalidate();

        //saida de dados
        tela.setLayout(null); //layout vazio
        tela.setVisible(true); //função para tornar a janela visivel
        tela2.setLayout(null);
        tela2.setVisible(true);
    }
}
