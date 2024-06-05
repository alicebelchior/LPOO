package joptionpane_revisao;

import javax.swing.*;
import java.awt.*;

public class JOPRevisao2 {

    /*
        Faça um programa que leia 10 números e informe:
            a)A soma destes números;
            b)A média destes números;
            c)O maior número; e
            d)O menor número.
     */
    public static void main(String[] args) {
        //dados a serem usados
        int numero[] = new int[10];
        int maiorNumero = Integer.MIN_VALUE; //o maior valor por ora valerá o menor inteiro suportado
        int menorNumero = Integer.MAX_VALUE; //o menor valor por ora valerá o maior inteiro suportado
        int somaNumero = 0;
        float mediaNumero = 0;

        //loop para entrada de dados
        for (int i = 0; i < 10; i++) {
            //enquanto o indice < 10, o array vai receber um numero
            //conversao de dados de entrada
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite dez números: ", JOptionPane.INFORMATION_MESSAGE));

            //soma das idades
            somaNumero += numero[i];

            //maior
            if (numero[i] > maiorNumero) {
                maiorNumero = numero[i];
            }
            //menor
            if (numero[i] < menorNumero) {
                menorNumero = numero[i];
            }
        }

        //media
        mediaNumero = somaNumero / numero.length;

        //saida de resultados
        JOptionPane.showMessageDialog(null, "Maior número digitado: " + maiorNumero
                + "\nMenor número digitado: " + menorNumero
                + "\nMédia dos números digitados: " + mediaNumero
                + "\nA soma dos números é: " + somaNumero);
    }

}
