package revisao;

import java.util.Scanner;

public class revisao2 {
    /*
    Faça um programa que leia 10 números e informe:
	A soma destes números;
	A média destes números;
	O maior número; e
	O menor número.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Variáveis
        int [] numeros = new int [10];
        int i, soma = 0, maior = 0, menor = 999999;
        float media;
        
        //Entrada de dados
        System.out.println("Digite 10 números: ");
        for (i = 0; i < 10; i++){
            numeros[i] = sc.nextInt();
            
            //Para cada entrada de dado, a soma vai aumentando
            soma += numeros[i];
            
            //Definição do maior e menor numero
            if(numeros[i] > maior){
                maior = numeros[i];
            } else {
                menor = numeros[i];
            }
        }
        //média dos numeros
        media = soma / numeros.length;
        
        //Saída de dados
        System.out.printf("O maior numero é %d e o menor, é %d%n", maior, menor);
        System.out.printf("A soma dos números é %d e a média, %.2f%n", soma, media);
        }
    }
