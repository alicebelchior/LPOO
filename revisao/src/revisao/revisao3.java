package revisao;

import java.util.Scanner;

/*
    Faça um programa que leia o nome, idade e sexo de várias pessoas até que o nome digitado seja “FIM” e informe:
	O nome e a idade da pessoa mais velha;
	O nome e a idade da pessoa mais nova;
	Quantas pessoas eram do sexo masculino;
	Quantas pessoas eram do sexo feminino; e
	A quantidade de pessoas digitadas e a média de idade.

*/

public class revisao3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Variáveis
        String nome, sexo, pessoaVelha, pessoaNova;
        int idade, maisVelho, maisNovo, homem = 0, mulher = 0, somaIdades = 0, totalPessoas = 0;
        float mediaIdades = 0;
        
        //Entrada de dados
        System.out.println("Digite um nome ou 'fim': ");
        nome = sc.next();
        while(nome.equalsIgnoreCase("fim")){
            System.out.println("Digite o sexo da pessoa (f/m): ");
            sexo = sc.next();
            System.out.println("Digite a idade da pessoa: ");
            idade = sc.nextInt();
            
            if (sexo.equalsIgnoreCase("f")){
                mulher++;
            } else {
                homem++;
            }
        }
    }
    
}
