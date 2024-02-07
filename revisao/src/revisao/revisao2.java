package revisao;
import java.util.Scanner;
public class revisao2 {
    /*
    Faça um programa que leia o nome, idade e sexo de várias pessoas até que o nome digitado seja “FIM” e informe:
	O nome e a idade da pessoa mais velha;
	O nome e a idade da pessoa mais nova;
	Quantas pessoas eram do sexo masculino;
	Quantas pessoas eram do sexo feminino; e
	A quantidade de pessoas digitadas e a média de idade.

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaração de variaveis
        String [] nome = new String [50];
        String [] sexo = new String [50];
        int [] idade = new int [50];
        int i = 0, mulher = 0, homem = 0, totalPessoas = 0, maisVelho = 0, maisNovo = 999, somaIdades = 0;
        String pessoaVelha = null, pessoaNova  = null;
        float mediaIdades = 0;
       
        // Começo da entrevista
        while (i < 50) {
            System.out.println("Digite seu nome: ");
            nome[i] = sc.next();
            
            // caso o usuario digite fim, o programa vai quebrar
            if (nome[i].equalsIgnoreCase("FIM")){
                break;
            } else {
                // começam as perguntas de verdade
                System.out.println("Digite seu sexo (masculino/feminino): ");
                sexo[i] = sc.next();
                System.out.println("Digite sua idade: ");
                idade[i] = sc.nextInt();   
                i++;
            }
            // pessoa mais velha/ mais nova
            if (idade[i] > maisVelho){
                maisVelho = idade[i];
                pessoaVelha = nome[i];
            } else {
                maisNovo = idade[i];
                pessoaNova = nome[i];
            }
            
            //idade total das pessoas
            somaIdades += idade[i];
            
            //total de pessoas
            totalPessoas +=1;
            
            // dos quais são de homens e mulheres
            if (sexo[i].equalsIgnoreCase("masculino")){
                homem += 1;
            } else{
                mulher += 1;
            }
        }
        //media de idade
        mediaIdades = somaIdades / idade.length;
        
        System.out.printf("A pessoa mais velha é %s com %d anos%n", pessoaVelha, maisVelho);
        System.out.printf("A pessoa mais nova é %s com %d anos%n", pessoaNova, maisNovo);
        System.out.printf("A quantidade de homens é %d%n", homem);
        System.out.printf("A quantidade de mulheres é %d%n", mulher);
        System.out.printf("A quantidade de pessoas foi de %d, com uma média de idades de %.2f anos.%n", totalPessoas);
    }
    
}
