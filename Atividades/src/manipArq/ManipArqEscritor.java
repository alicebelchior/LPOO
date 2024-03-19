/*
Faça um programa para gerar um arquivo que esteja gravado na raiz da unidade C: do computador,
coloque um texto com 10 linhas. 
Deixe uma linha em branco entre cada linha escrita.
Faça também um programa para poder ler este arquivo que está gravado na raiz da unidade C: do computador.
 */
package manipArq;

import java.io.*;

public class ManipArqEscritor {

    public static void main(String[] args) {

        //tentando criar o arquivo 
        try {

            //instanciando a classe "FileWriter"
            FileWriter escritor = new FileWriter("arquivo.txt");

            //gravação do texto no arq. aberto pelo "FileWriter", pela classe "BufferedWriter"
            BufferedWriter saida = new BufferedWriter(escritor);

            //escrita dos textos na "fila de gravação"
            saida.write("Há muito tempo, num reino distante, viviam um rei, uma rainha e sua filhinha, a princesa Branca de Neve. \n");
            saida.write("Sua pele era branca como a neve, os lábios vermelhos como o sangue e os cabelos pretos como o ébano.\n");
            saida.write("Um dia, a rainha ficou muito doente e morreu. O rei, sentindo-se muito sozinho, casou-se novamente.\n");
            saida.write("O que ninguém sabia é que a nova rainha era uma feiticeira cruel, invejosa e muito vaidosa.\n");
            saida.write("Ela possuía um espelho mágico, para o qual perguntava todos os dias: \n");
            saida.write("'Espelho, espelho meu! Há no mundo alguém mais bela do que eu?' \n");
            saida.write("'És a mais bela de todas as mulheres, minha rainha!', ele lhe respondia. \n");
            saida.write("Branca de Neve crescia e ficava cada vez mais bonita, encantadora e meiga. \n");
            saida.write("Todos gostavam muito dela, exceto a rainha, pois tinha medo que Branca de Neve se tornasse mais bonita que ela. \n");
            saida.write("Depois que o rei morreu, a rainha obrigava a princesa a vestir-se com trapos e a trabalhar na limpeza e na arrumação de todo o castelo.\n");
            
            //gravação dos textos da fila para o arquivo
            saida.flush();
            System.out.println("Arquivo escrito com sucesso!");
            
        // Se houver erro, sera capturado pelo "e" e soltará uma mensagem
        } catch(IOException e) {
            System.out.println("Não foi possível escrever o arquivo!");
        }
    }
}
