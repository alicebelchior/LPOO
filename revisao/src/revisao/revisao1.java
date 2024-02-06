
package revisao;

import java.util.Scanner;

public class revisao1 {
 /*
    Faça um programa que leia a idade de várias pessoas em uma pesquisa. A leitura das idades se encerra quando for digitada a idade 0 (zero).
        Com as idades digitadas responda:
        Qual a maior idade digitada?
        Qual a menor idade digitada?
        Qual a média das idades?
        Quantas pessoas declararam ter idade menor que 18?

*/
    public static void main(String[] args) {
        int maiorIdade = 0;
        int menorIdade = 99999;
        int deMenor = 0;
        float mediaIdades;
        int somaIdades = 0;
        int totalIdades = 0;
        
        Scanner sc = new Scanner(System.in);     
        System.out.println("Digite as idades: ");  
                
        for (int i = 0; i < 10; i++){   
            int idade = sc.nextInt();         
            if(idade != 0){
                somaIdades += idade;
                totalIdades += 1;  
            } else {
                break;
            } 
            
            if (idade < 18){
                deMenor += 1;
                menorIdade = idade;
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
            } else if (idade < menorIdade){
                menorIdade = idade;
            }
        }
        mediaIdades = somaIdades / totalIdades;
        
        System.out.printf("A maior idade é %d e a menor idade é %d%n", maiorIdade, menorIdade);
        System.out.printf("A soma das idades é %d. A média, %.2f%n", somaIdades, mediaIdades);
        System.out.printf("Existe(m) %d menor(es) de idades%n", deMenor);
    }
    
}
