package InterfacePesquisa;

import java.text.ParseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;

/*
Faça um formulário com campos formatados que contenha:
- CPF
- CEP
- Telefone
- CNPJ
- Sigla de estado com duas letras maiúsculas
- Nome só com letras maiúsculas
- e-mail só com letras minúsculas
 */

/*
https://www.devmedia.com.br/java-swing-conheca-os-componentes-jtextfield-e-jformattedtextfield/30981
https://www.youtube.com/watch?v=lVj3Lzn6Rlw

*/

public class Pesquisa {

    public static void main(String[] args) {
        //config da tela
        JFrame tela = new JFrame("");
        tela.setBounds(100, 100, 500, 600);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        //CNPJ
        //Sigla de estado com duas letras maiúsculas
        //Nome só com letras maiúsculas
        //e-mail só com letras minúsculas
        //saída de dados
        
        
        //Campos p/ preenchimento do formulario de pesquisa
        //definição da mascara
        MaskFormatter maskCpf = null;
        MaskFormatter maskCep = null;

        
        try {
            maskCpf = new MaskFormatter("###.###.###-##");
            maskCep = new MaskFormatter("##.###-###");
            
        } catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Essa porcaria deu problema");
        }
        
        //configuração das mascaras
        JFormattedTextField cpfFormat = new JFormattedTextField(maskCpf);
        cpfFormat.setBounds(80, 20, 100, 30);
        tela.add(cpfFormat);
        
        JFormattedTextField cepFormat = new JFormattedTextField(maskCep);
        cepFormat.setBounds(80, 60, 100, 30);
        tela.add(cepFormat);
        
        tela.setLayout(null);
        tela.setVisible(true);
    }
}
