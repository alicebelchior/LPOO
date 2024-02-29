package revisao;

import java.util.Scanner;
import java.util.Arrays;

public class revisao5 {

    /*
    Faça um programa que gere um vetor de 10 posições para números inteiros, preencha o vetor com números diversos,
    organize o vetor do menor para o maior e mostre:
	O vetor digitado originalmente;
	O vetor organizado do menor para o maior;

    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variaveis
        int i;
        int [] vetor = new int[10];
        
        //entrada de dados
        System.out.println("Digite 10 números aleatórios: ");
        for (i = 0; i < 10; i++) { 
            vetor[i] = sc.nextInt();
        }
        
        //printando o vetor original
        System.out.println("Vetor original:");
        for(i = 0; i < 10; i++){
            System.out.print(vetor[i] + " ");
        }
        
        //Organizando o vetor de forma crescente
        Arrays.sort(vetor);
        
        //e printando
        System.out.println();
        System.out.println("Vetor organizado:");
        for(i = 0; i < 10; i++){
            System.out.print(vetor[i] + " ");
        }
        
    }
    
}
