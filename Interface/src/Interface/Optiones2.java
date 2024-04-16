package Interface;

import javax.swing.*;
import java.awt.*;

public class Optiones2 {

    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Você quer mesmo ler minha mensagem?", "Pergunta besta",
            JOptionPane.YES_NO_CANCEL_OPTION);
        if (opcao == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu ler a mensagem!", "Parabéns!",
                JOptionPane.INFORMATION_MESSAGE);
        } else if (opcao == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Você é um imaturo!", "Porcaria!",
                JOptionPane.ERROR_MESSAGE);
        } else if (opcao == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Você ficou indeciso e resolveu recuar! É um fraco?", "Covarde!",
                JOptionPane.QUESTION_MESSAGE);
        }
    }
}
