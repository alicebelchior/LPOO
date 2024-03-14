package TCF;

import java.io.*;

public class Leitor {

    //metodo executor
    public static void main(String[] args) {
        try {
            /*
             - instanciando a classe "FileReader"
             - esse arquivo será lido
             */
            FileReader leitor = new FileReader("arquivo.txt");

            //A classe irmã BufferedReader faz a leitura de um arquivo-texto.
            BufferedReader entrada = new BufferedReader(leitor);
            String linha;
            while ((linha = entrada.readLine()) != null) {
                /*
                "linha" vai receber uma linha do arquivo txt que está aberto em "entrada"
                com o while, a cada rodada o programa vai ler uma nova linha
                isso se repete enquanto o resultado não for NULL
                 */
                System.out.println(linha);
            }
        } catch (IOException e) { //se o arquivo não for encontrado, vai da erro
            System.out.println("Não deu para ler o arquivo");
        }
    }
}
