
package InterfaceJOptionPane;
import javax.swing.*;
import java.awt.*;

public class Revisao {
     public static void main(String[] args) {
    /*
        Faça um programa que leia a idade de varias pessoas em uma pesquisa.
        Com as idades digitadas, responda:
        Qual a maior idade digitada?
        Qual menor idade digitada?
        Qual a media das idades?
        Quantas pessoas declaram que tem idade menor que 18?
    */
    
    String idade = JOptionPane.showInputDialog(null, "Digite uma idade", "Adivinho de idades",
            JOptionPane.QUESTION_MESSAGE); //O último argumento é o tipo de mensagem que queremos exibir (simbolo de interrogação)
     }
}
