package joptionpane_revisao;

import javax.swing.*;
import java.awt.*;

public class JOPRevisao3 {

    /*
    Faça um programa que leia o nome, idade e sexo de várias pessoas até que o nome digitado seja “FIM” e informe:
	O nome e a idade da pessoa mais velha;
	O nome e a idade da pessoa mais nova;
	Quantas pessoas eram do sexo masculino;
	Quantas pessoas eram do sexo feminino; e
	A quantidade de pessoas digitadas e a média de idade.
     */
    public static void main(String[] args) {
        //Variáveis
        String pessoaVelha = null;
        String pessoaNova = null;
        String nome = null;
        String sexo;
        int idade, maisVelho = Integer.MIN_VALUE, maisNovo = Integer.MAX_VALUE, homem = 0, mulher = 0, somaIdades = 0, totalPessoas = 0;
        float mediaIdades = 0;

        //entrada de dados
        while (true) {
            //enquanto não for digitado fim, vai ler o codigo
            nome = JOptionPane.showInputDialog(null, "Digite um nome ou 'fim': ", "É menino ou menina?",
                    JOptionPane.INFORMATION_MESSAGE);

            if (nome.equalsIgnoreCase("fim")) {
                break;
            } else {

                //se não for digitado fim, pede-se o sexo da pessoa
                sexo = JOptionPane.showInputDialog(null, "Digite o sexo ('f' ou 'm') da " + nome, "Quero nomes!", JOptionPane.INFORMATION_MESSAGE);

                //TOTAL DE PESSOAS
                totalPessoas++;

                //contagem de homis e muié
                if (sexo.equalsIgnoreCase("f")) {
                    mulher += 1;
                } else if (sexo.equalsIgnoreCase("m")) {
                    homem += 1;
                } else {
                    System.out.println("Ou é homem ou é mulher, para de besteira!");
                    break;
                }

                //entrada de dados de idades
                String digiteIdade = JOptionPane.showInputDialog(null, "Digite a idade de " + nome, "Agora quero idades!", JOptionPane.INFORMATION_MESSAGE);
                idade = Integer.parseInt(digiteIdade);

                //mais velho
                if (idade > maisVelho) {
                    maisVelho = idade;
                    pessoaVelha = nome;
                }
                //mais novo
                if (idade < maisNovo) {
                    maisNovo = idade;
                    pessoaNova = nome;
                }
                //soma das idades
                somaIdades += idade;
            }
        }
        //media das idades
        mediaIdades = somaIdades / totalPessoas;

        //saida de dados
        String resultadoFinal = "Pessoa mais velha: " + pessoaVelha + ", idade: " + maisVelho + "\n" +
                "Pessoa mais nova: " + pessoaNova + ", idade: " + maisNovo + "\n" +
                "Total de pessoas do sexo masculino: " + homem + "\n" +
                "Total de pessoas do sexo feminino: " + mulher + "\n" +
                "Total de pessoas digitadas: " + totalPessoas + "\n" +
                "Média de idade: " + mediaIdades;

        JOptionPane.showMessageDialog(null, resultadoFinal);

    }

}
