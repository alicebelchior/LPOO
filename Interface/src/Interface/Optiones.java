package Interface;

import javax.swing.*;
import java.awt.*;

public class Optiones {

    public static void main(String[] args) {
        //NULL, colocado num campo onde devemos informar o objeto “pai” do JOptionPane
        //o segundo argumento é a mensagem em si
        //O terceiro é o título da caixa de mensagem
        //O último argumento é o tipo de mensagem que queremos exibir
        JOptionPane.showMessageDialog(null, "Uma mensagem!",
                "Titulo", JOptionPane.PLAIN_MESSAGE);
    }
}
