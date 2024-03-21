package manipArq;

import java.io.*;

public class ManipArqLeitor {

    public static void main(String[] args) {
        //tentando criar o arquivo 
        try {
            
            //Instanciando a classe "FileReader"
            FileReader leitor = new FileReader("arquivo.txt");
            
            //Leitura do arquivo.txt
            BufferedReader entrada = new BufferedReader(leitor);
            String linha;
            
            //a var "linha" vai receber uma linha do arquivo na "entrada" enquanto o resultado não for nulo
            while ((linha = entrada.readLine()) != null) {
                System.out.println(linha);
            }
        } catch(IOException e) { //se o arquivo não for encontrado, erro
            System.out.println("Não foi possível ler o arquivo");
        }
    }

}
