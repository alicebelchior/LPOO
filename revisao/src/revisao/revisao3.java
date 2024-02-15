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
        String nome = "", sexo, pessoaVelha = "", pessoaNova = "";
        int idade, maisVelho = 0, maisNovo = 1000, homem = 0, mulher = 0, somaIdades = 0, totalPessoas = 0;
        float mediaIdades = 0;
        
        //Entrada de dados       
        while(!nome.equalsIgnoreCase("fim")){
        //nome ou fim
            System.out.println("Digite um nome ou 'fim': ");
            nome = sc.next();
            
            // se não for digitado fim
            if(!nome.equalsIgnoreCase("fim")){
                //contagem de mulheres e homens, e o total de pessoas
                System.out.println("Digite o sexo da pessoa (f/m): ");
                sexo = sc.next();

                if (sexo.equalsIgnoreCase("f")){
                    mulher++;
                } else if(sexo.equalsIgnoreCase("m")) {
                    homem++;
                }

                totalPessoas++;

                //Mais velho, mais novo e a soma das idades
                System.out.println("Digite a idade da pessoa: ");
                idade = sc.nextInt();

                somaIdades += idade;

                if (idade > maisVelho){
                    maisVelho = idade;
                    pessoaVelha = nome;
                } 
                if(idade < maisNovo) {
                    maisNovo = idade;
                    pessoaNova = nome;
                }
            }
        }
        //média das idades
        mediaIdades = somaIdades / totalPessoas;
        
        //Saída de dados
        System.out.printf("A pessoa mais velha é %s, com %d anos, e a mais nova é %s com %d anos.%n", pessoaVelha, maisVelho, pessoaNova, maisNovo);
        System.out.printf("Existem %d mulheres e %d homens.%n", mulher, homem);
        System.out.printf("Foram registradas %d pessoas.%n", totalPessoas);
        System.out.printf("A soma das idades é %d. A média, %.2f%n", somaIdades, mediaIdades);
    }
    
}
