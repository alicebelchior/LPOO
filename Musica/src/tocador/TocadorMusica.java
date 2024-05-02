package tocador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TocadorMusica {

    public static void main(String[] args) {
        FileInputStream in;
        try {
            //Inicializa o FileInputStream com o endereço do arquivo para tocar
            in = new FileInputStream("ladygaga.mp3");

            //Cria uma instancia da classe player passando para ele o InpuStream do arquivo
            Player p = new Player(in);

            //executa o som
            p.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
