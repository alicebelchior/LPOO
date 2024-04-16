package Interface;

import javax.swing.*;
import java.awt.*;

public class Optiones3 {

    public static void main(String[] args) {

        String[] botoes = {"Abort", "Retry", "Fail", "CTRL+ALT+DEL","NADA ESCOLHIDO"};
        int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Sem saída", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
        
        JOptionPane.showMessageDialog(null, botoes[opcao], "Opção escolhida",
            JOptionPane.WARNING_MESSAGE);

    }
}
