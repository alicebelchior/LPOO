package TCF;

import java.io.*;

public class Escritor {

    //metodo executor
    public static void main(String[] args) {
        try {
            /*
             - instanciando a classe "FileWriter"
             - esse arquivo será criado na própria pasta onde roda o programa
             */
            FileWriter escritor = new FileWriter("arquivo.txt");

            // a classe "BufferedWriter" permite gravar textos inteiros no arquivo aberto pelo "FileWriter"
            BufferedWriter saida = new BufferedWriter(escritor);

            //Os três comandos fazem o trabalho de gravar um texto no arquivo aberto
            //Os "saida.write" escrevem texto em uma espécie de “fila de gravação”, 
            //Ao executar o ".flush" o que estava na fila irá para o arquivo
            saida.write("Olá mundo \n");
            saida.write("Viva o jogo dos Canibais! ");
            saida.flush();
        } catch (IOException e) {
            System.out.println("Não deu para escrever o arquivo");
        }
    }
}
