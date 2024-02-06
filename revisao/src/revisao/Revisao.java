
package revisao;

import java.util.Scanner;

public class Revisao {
    /*
    Faça um programa que leia a idade de varias pessoas em uma pesquisa.
    Com as idades digitadas, responda:
    Qual a maior idade digitada?
    Qual menor idade digitada?
    Qual a media das idades?
    Quantas pessoas declaram que tem idade menor que 18?
    */
    public static void main(String[] args) {
        int [] idade = new int [10];
        int somaIdades = 0;
        int maiorIdade = 0;
        int menorIdade = 9999;
        float mediaIdades;
        int deMenor = 0;
        
        Scanner age = new Scanner(System.in);
        System.out.println("Digite as idades: ");

        for (int i = 0; i < 10;  i++){
            idade[i] = age.nextInt(); 
            
            somaIdades += idade[i];
            
            if (idade[i] < 18){
                deMenor += 1;
                menorIdade = idade[i];
            }

            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
            } else if (idade[i] < menorIdade){
                menorIdade = idade[i];
            }
        }
        
        mediaIdades = somaIdades/idade.length;
        
        System.out.printf("A maior idade é %d e a menor idade é %d%n", maiorIdade, menorIdade);
        System.out.printf("A soma das idades é %d. A média, %.2f%n", somaIdades, mediaIdades);
        System.out.printf("Existe(m) %d menor(es) de idades%n", deMenor);
    } 
   
}
