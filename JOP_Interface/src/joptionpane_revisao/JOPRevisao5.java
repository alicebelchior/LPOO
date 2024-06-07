package joptionpane_revisao;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class JOPRevisao5 {

    /*
    Faça um programa que gere um vetor de 10 posições para números inteiros, preencha o vetor com números diversos,
    organize o vetor do menor para o maior e mostre:
	O vetor digitado originalmente;
	O vetor organizado do menor para o maior;
     */
    public static void main(String[] args) {
        //variaveis
        int i;
        int[] vetor = new int[10];

        //entrada de dados
        for (i = 0; i < vetor.length; i++) {
            String numeros = JOptionPane.showInputDialog(null, "Digite dez números aleatórios, faz o favor.", "Organizador de números",
                    JOptionPane.WARNING_MESSAGE);

            //conversão de dados
            vetor[i] = Integer.parseInt(numeros);
        }

        //printando o vetor original
        String original = "Vetor original:\n";
        for (i = 0; i < vetor.length; i++) 
            //concatenando a string com o vetor
            original += vetor[i] + " ";
        JOptionPane.showMessageDialog(null, original);

        //Organizando o vetor de forma crescente
        Arrays.sort(vetor);

        //e printando
        String organizado = "Vetor organizado:\n";
        for (i = 0; i < vetor.length; i++) {
            //concatenando a string com o vetor
            organizado += vetor [i] + " ";
        }
        JOptionPane.showMessageDialog(null, organizado);

    }

}
