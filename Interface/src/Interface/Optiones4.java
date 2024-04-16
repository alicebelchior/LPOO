package Interface;

import javax.swing.*;
import java.awt.*;

public class Optiones4 {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog(null, "Escreva seu nome aí", "Pegadinha",
            JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, texto, "O otário do ano", 
            JOptionPane.INFORMATION_MESSAGE);

    }

}
