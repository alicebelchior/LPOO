package InterfacePesquisa;

import java.text.ParseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;

public class Pesquisa {

    public static void main(String[] args) {
        //config da tela
        JFrame tela = new JFrame("Formulário de Pesquisa");
        JLabel fundoTela = new JLabel(new ImageIcon("src/trabalhadores.jpg"));
        tela.setBounds(100, 100, 500, 500);
        tela.setContentPane(fundoTela);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //config do fundo de tela
//        ImageIcon fundoTela = new ImageIcon("trabalhadores.jpg");
//        JLabel fundo = new JLabel(fundoTela);
//        fundo.setIcon(fundoTela);
//        fundo.setBounds(100, 100, 500, 500);
//        tela.revalidate();


        //Labels do formulario da pesquisa
        //CPF
        JLabel cpf = new JLabel("CPF");
        cpf.setBounds(20, 20, 50, 30);
        tela.add(cpf);

        //CEP
        JLabel cep = new JLabel("CEP");
        cep.setBounds(20, 60, 50, 30);
        tela.add(cep);

        //Telefone
        JLabel fone = new JLabel("Telefone");
        fone.setBounds(20, 100, 50, 30);
        tela.add(fone);

        //CNPJ
        JLabel cnpj = new JLabel("CNPJ");
        cnpj.setBounds(20, 140, 50, 30);
        tela.add(cnpj);

        //Sigla de estado
        JLabel uf = new JLabel("Estado");
        uf.setBounds(20, 180, 50, 30);
        tela.add(uf);

        //Nome
        JLabel nome = new JLabel("Nome");
        nome.setBounds(20, 220, 50, 30);
        tela.add(nome);

        //e-mail
        JLabel email = new JLabel("E-mail");
        email.setBounds(20, 260, 50, 30);
        tela.add(email);

        //Campos p/ preenchimento do formulario de pesquisa
        //definição da mascara
        MaskFormatter maskCpf = null;
        MaskFormatter maskCep = null;
        MaskFormatter maskFone = null;
        MaskFormatter maskCnpj = null;
        MaskFormatter maskUf = null;
        MaskFormatter maskNome = null;
        MaskFormatter maskEmail = null;

        try {
            maskCpf = new MaskFormatter("###.###.###-##");
            maskCep = new MaskFormatter("##.###-###");
            maskFone = new MaskFormatter("(##)#####-####");
            maskCnpj = new MaskFormatter("##.###.###/0001-##");
            maskUf = new MaskFormatter("UU"); //Sigla de estado com duas letras maiúsculas
            maskNome = new MaskFormatter("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU"); //Nome só com letras maiúsculas
            maskEmail = new MaskFormatter("******************************"); //e-mail só com letras minúsculas
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Essa porcaria deu problema");
        }

        //configuração das mascaras
        JFormattedTextField cpfFormat = new JFormattedTextField(maskCpf);
        cpfFormat.setBounds(80, 20, 100, 30);
        tela.add(cpfFormat);

        JFormattedTextField cepFormat = new JFormattedTextField(maskCep);
        cepFormat.setBounds(80, 60, 100, 30);
        tela.add(cepFormat);

        JFormattedTextField foneFormat = new JFormattedTextField(maskFone);
        foneFormat.setBounds(80, 100, 100, 30);
        tela.add(foneFormat);

        JFormattedTextField cnpjFormat = new JFormattedTextField(maskCnpj);
        cnpjFormat.setBounds(80, 140, 150, 30);
        tela.add(cnpjFormat);

        JFormattedTextField ufFormat = new JFormattedTextField(maskUf);
        ufFormat.setBounds(80, 180, 50, 30);
        tela.add(ufFormat);

        JFormattedTextField nomeFormat = new JFormattedTextField(maskNome);
        nomeFormat.setBounds(80, 220, 220, 30);
        tela.add(nomeFormat);

        JFormattedTextField emailFormat = new JFormattedTextField(maskEmail);
        emailFormat.setBounds(80, 260, 220, 30);
        tela.add(emailFormat);

        //saída de dados
        tela.setLayout(null);
        tela.setVisible(true);
    }
}
