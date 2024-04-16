package Interface;

import java.awt.*;
import javax.swing.*;

class Menus {

    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setBounds(100, 100, 800, 600);

        JMenuBar menuzao = new JMenuBar();

        JMenu menuarquivo = new JMenu("Arquivo");
        JMenuItem itemnovo = new JMenuItem("Novo");
        JMenuItem itemsalvar = new JMenuItem("Salvar");
        
        JMenu menuhelp = new JMenu("Help");
        JMenuItem itemajuda = new JMenuItem("Ajuda");
        JMenuItem itemsobre = new JMenuItem("Sobre");
        
        JMenu menudentro = new JMenu("Mais opções");
        JMenuItem itempanico = new JMenuItem("CTRL+ALT+DEL");
        JMenuItem itemterror = new JMenuItem("Tela Azul da Morte");
        
        menuarquivo.add(itemnovo);
        menuarquivo.add(itemsalvar);
        
        menuhelp.add(itemajuda);
        menuhelp.add(itemsobre);
        
        menudentro.add(itempanico);
        menudentro.add(itemterror);
        
        menuzao.add(menuarquivo);
        menuzao.add(menuhelp);
        
        menuarquivo.add(menudentro);
        
        tela.setJMenuBar(menuzao);
        tela.setVisible(true);
    }

}
