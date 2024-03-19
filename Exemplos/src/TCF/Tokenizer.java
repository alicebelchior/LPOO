package TCF;

import java.io.*;
import java.util.*;

public class Tokenizer {

    public static void main(String[] args) {
        try {
            
            //Instanciando a classe "FileReader"
            FileReader leitor = new FileReader("bebidas.txt");
            
            //Leitura do arquivo txt
            BufferedReader entrada = new BufferedReader(leitor);
            String linha;
            
            //"linha" vai receber uma linha do arquivo na "entrada" enquanto o resultado não for nulo
            while ((linha = entrada.readLine()) != null) {
                
                //pegando a linha que esta entrando os dados e quebrando cada uma um ";"
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
