package joptionpane_revisao;

import javax.swing.*;
import java.awt.*;

public class JOPRevisao1 {

    /*
    Faça um programa que leia a idade de várias pessoas em uma pesquisa. A leitura das idades se encerra quando for digitada a idade 0 (zero).
        Com as idades digitadas responda:
        Qual a maior idade digitada?
        Qual a menor idade digitada?
        Qual a média das idades?
        Quantas pessoas declararam ter idade menor que 18?

     */
    public static void main(String[] args) {
        //dados a serem usados
        int maiorIdade = 0;
        int menorIdade = 9999;
        int somaIdades = 0;
        int deMenor = 0;
        int qntdIdade = 0;
        float mediaIdades = 0;
        int idades;

        do {
            //entrada de dados
            String idade = JOptionPane.showInputDialog(null, "Digite a idade da pessoa ou '0'(zero)", "Adivinho de idades",
                    JOptionPane.QUESTION_MESSAGE); //1. pergunta, 2. titulo da cx de msg, 3. o simbolo que queremos exibir (simbolo de interrogação)
            //conversao de dados de entrada
            idades = Integer.parseInt(idade);

            //para idades que nao sejam 0
            if (idades != 0) {
                //soma das idades
                somaIdades += idades;
                //quantidade de idades totais
                qntdIdade += 1;

                //mais velho
                if (idades > maiorIdade) {
                    maiorIdade = idades;
                }
                //mais novo
                if (idades < menorIdade) {
                    menorIdade = idades;
                }
                //quantas menoridades
                if (idades < 18) {
                    deMenor += 1;
                }
            }

        } while (idades != 0);
        
        //media
        mediaIdades = somaIdades / qntdIdade;

        //saida de resultados
        JOptionPane.showMessageDialog(
                null, "Maior idade digitada: " + maiorIdade
                + "\nMenor idade digitada: " + menorIdade
                + "\nMédia das idades: " + mediaIdades
                + "\nPessoas com idade menor que 18: " + deMenor);
    }

}
