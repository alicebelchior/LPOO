package TCF;

import java.io.*;
import java.util.*;

public class Tokenizer {

    public static void main(String[] args) {
        try {
            FileReader leitor = new FileReader("arquivo.txt");
            BufferedReader entrada = new BufferedReader(leitor);
            String linha;
            while ((linha = entrada.readLine()) != null) {
                StringTokenizer tok = new StringTokenizer(linha, ";");
                System.out.println("Bebida: " + tok.nextToken());
                System.out.println("Origem: " + tok.nextToken());
                System.out.println("Grau de alcool: " + tok.nextToken());
                System.out.println("-----------------------");
            }
        } catch (Exception e) {
            System.out.println("Não deu para escrever o arquivo");
        }
    }
}
