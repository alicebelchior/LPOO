package revisao;

import java.util.Scanner;

public class revisao4 {

    /*
    Faça um programa que leia o número e o peso de um boi, a leitura encerra quando o número digitado for 0 (zero) e informe:
	Quantos bois foram digitados;
	Qual o total de peso dos bois;
	Qual a média de peso dos bois;
	Qual o número e o peso do boi mais pesado; e
	Qual o número e o peso do boi mais leve.

    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Variáveis
        int numero = 0, numBoiPesado = 0, numBoiLeve = 0, totalBoi = 0;
        float pesoBoi = 0, pesoTotal = 0, mediaPeso = 0, boiPesado = 0, boiLeve = 10000000;
        
        //Entrada de dados
        while(pesoBoi != 0){ //leitura encerra quando o número digitado for 0
            System.out.println("Digite o número e o peso do boi (em arrobas):");
            numero = sc.nextInt();
            pesoBoi = sc.nextFloat();
        
            if(pesoBoi != 0){ //se não for digitado 0
                //para cada boi registrado, o peso total aumenta
                pesoTotal += pesoBoi;
                
                //para cada boi registrado, a qntd aumenta
                totalBoi += 1;
                
                //qual é o mais pesado
                if(pesoBoi > boiPesado){
                    boiPesado = pesoBoi;
                    numBoiPesado = numero;
                }
                //qual é o mais leve
                if(pesoBoi < boiLeve){
                    boiLeve = pesoBoi;
                    numBoiLeve = numero;
                }
            }
        }
        mediaPeso = pesoTotal / totalBoi;
    }
    
}
