package InterfacePesquisa;


import javax.swing.*;
import java.awt.*;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;

public class Pesquisa {

    public static void main(String[] args) {
        //config da tela
        JFrame tela = new JFrame("Formulário de Pesquisa");
        tela.setBounds(100, 100, 600, 500);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //config do fundo de tela
        JLabel fundoTela = new JLabel(new ImageIcon("trabalhoadores.jpg"));
        tela.setContentPane(fundoTela);

        //Labels do formulario da pesquisa
        //CPF
        JLabel cpf = new JLabel("CPF");
        cpf.setFont(new Font("Arial", Font.BOLD, 20));
        cpf.setBounds(35, 30, 100, 30);
        tela.add(cpf);

        //CEP
        JLabel cep = new JLabel("CEP");
        cep.setFont(new Font("Arial", Font.BOLD, 20));
        cep.setBounds(35, 70, 100, 30);
        tela.add(cep);

        //Telefone
        JLabel fone = new JLabel("Telefone");
        fone.setFont(new Font("Arial", Font.BOLD, 20));
        fone.setBounds(35, 110, 100, 30);
        tela.add(fone);

        //CNPJ
        JLabel cnpj = new JLabel("CNPJ");
        cnpj.setFont(new Font("Arial", Font.BOLD, 20));
        cnpj.setBounds(35, 150, 100, 30);
        tela.add(cnpj);

        //Sigla de estado
        JLabel uf = new JLabel("Estado");
        uf.setFont(new Font("Arial", Font.BOLD, 20));
        uf.setBounds(35, 190, 100, 30);
        tela.add(uf);

        //Nome
        JLabel nome = new JLabel("Nome");
        nome.setFont(new Font("Arial", Font.BOLD, 20));
        nome.setBounds(35, 230, 100, 30);
        tela.add(nome);

        //e-mail
        JLabel email = new JLabel("E-mail");
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setBounds(35, 270, 100, 30);
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
        cpfFormat.setBounds(200, 30, 100, 30);
        tela.add(cpfFormat);

        JFormattedTextField cepFormat = new JFormattedTextField(maskCep);
        cepFormat.setBounds(200, 70, 100, 30);
        tela.add(cepFormat);

        JFormattedTextField foneFormat = new JFormattedTextField(maskFone);
        foneFormat.setBounds(200, 110, 100, 30);
        tela.add(foneFormat);

        JFormattedTextField cnpjFormat = new JFormattedTextField(maskCnpj);
        cnpjFormat.setBounds(200, 150, 150, 30);
        tela.add(cnpjFormat);

        JFormattedTextField ufFormat = new JFormattedTextField(maskUf);
        ufFormat.setBounds(200, 190, 50, 30);
        tela.add(ufFormat);

        JFormattedTextField nomeFormat = new JFormattedTextField(maskNome);
        nomeFormat.setBounds(200, 230, 220, 30);
        tela.add(nomeFormat);

        JFormattedTextField emailFormat = new JFormattedTextField(maskEmail);
        emailFormat.setBounds(200, 270, 220, 30);
        tela.add(emailFormat);
        
        //config dos icons
        //icon 1
        ImageIcon icon1 = new ImageIcon("bp.jpg");
        JButton btn1 = new JButton();
        btn1.setIcon(icon1);
        btn1.setBounds(50, 350, 260, 100);
        tela.add(btn1);
        tela.revalidate();
        
        //icon 2
        ImageIcon icon2 = new ImageIcon("rp.jpg");
        JButton btn2 = new JButton();
        btn2.setIcon(icon2);
        btn2.setBounds(311, 350, 260, 100);
        tela.add(btn2);
        tela.revalidate();

        //saída de dados
        tela.setLayout(null);
        tela.setVisible(true);
    }
}
