package InterfaceFormulario;

import javax.swing.*;
import java.awt.*;

public class Formulário {

    /*
    Faça um formulário e utilize label, textfield, button e toglebutton em seu formulário, 
    faça um cadastro de endereço de um funcionário, seus dependentes, formação, bens e profissão
     */
    public static void main(String[] args) {
        //configuração da tela
        JFrame form = new JFrame("Formulário de cadastro");
        form.setBounds(100, 100, 500, 600);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        form.getContentPane().setBackground(Color.LIGHT_GRAY);

        //campos do formulario
        //endereço
        JLabel endereco = new JLabel("Endereço");
        endereco.setBounds(50, 50, 70, 40);
        form.add(endereco);

        JTextField enderecoCampo = new JTextField();
        enderecoCampo.setBounds(120, 50, 300, 40);
        form.add(enderecoCampo);

        //dependentes
        JLabel dependentes = new JLabel("Dependentes");
        dependentes.setBounds(50, 120, 90, 40);
        form.add(dependentes);
        
        JToggleButton filho = new JToggleButton("Filho");
        filho.setBounds(150, 120, 90, 40);
        form.add(filho);
        
        JToggleButton pai = new JToggleButton("Pai/Mãe");
        pai.setBounds(245, 120, 90, 40);
        form.add(pai);
                
        //formação
        JLabel formacao = new JLabel("Formação");
        formacao.setBounds(50, 190, 90, 40);
        form.add(formacao);
        
        JButton formacaoSuperior = new JButton("Superior");
        formacaoSuperior.setBounds(150, 190, 90, 40);
        form.add(formacaoSuperior);
        
        JButton formacaoTecnico = new JButton("Técnico");
        formacaoTecnico.setBounds(245, 190, 90, 40);
        form.add(formacaoTecnico);
        
        JTextField curso = new JTextField();
        curso.setBounds(150, 240, 270, 40);
        form.add(curso);
        
        //bens
        JLabel bens = new JLabel("Bens");
        bens.setBounds(50, 310, 90, 40);
        form.add(bens);
        
        JTextField bensCampo = new JTextField();
        bensCampo.setBounds(120, 310, 300, 40);
        form.add(bensCampo);
        
        //profissão
        JLabel profissao = new JLabel("Profissão");
        profissao.setBounds(50, 380, 90, 40);
        form.add(profissao);
        
        JTextField profissaoCampo = new JTextField();
        profissaoCampo.setBounds(120, 380, 300, 40);
        form.add(profissaoCampo);
        
        //botão submit
        JButton enviar = new JButton("Enviar");
        enviar.setBounds(200, 450, 90, 50);
        form.add(enviar);
        
        //saida de dados
        form.setLayout(null);
        form.setVisible(true);
    }

}
