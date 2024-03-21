/*
Crie um arquivo no bloco de notas com as informações de:
Estado - Cidade - População - Atração turística de 10 cidades,
use como token o "-",  faça a leitura mostrando:
    Estado: xxxxxxxx.
    Cidade: xxxxxxxxxx.
    População Atual: xxxxxxxxxxx.
    Atração turística: xxxxxxxxxxxx.
 */
package tokenizer;

import java.io.*;
import java.util.StringTokenizer;

public class Tokenizer {

    public static void main(String[] args) {
        try {
            //Instanciando a classe "FileReader"
            FileReader leitor = new FileReader("turismo.txt");

            //Leitura do arquivo.txt
            BufferedReader entrada = new BufferedReader(leitor);
            String linha;

            //a var "linha" vai receber uma linha do arquivo na "entrada" enquanto o resultado não for nulo
            while ((linha = entrada.readLine()) != null) {

                //pegando a linha que esta entrando os dados e quebrando cada uma um "-"
                StringTokenizer tok = new StringTokenizer(linha, "-");
                System.out.println("Estado: " + tok.nextToken());
                System.out.println("Cidade: " + tok.nextToken());
                System.out.println("População atual: " + tok.nextToken());
                System.out.println("Atração turística: " + tok.nextToken());
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Não deu para escrever o arquivo");
        }
    }
}
