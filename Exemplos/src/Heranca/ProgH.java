package Heranca;

public class ProgH {

    public static void main(String[] args) {
        Carro opala = new Carro("Opala", 1988, "Luxo");
        Tanque tamoio = new Tanque("Tamoio", 1999,50);
        
        System.out.println("O carro " + opala.modelo + ", da categoria " + opala.categoria + ", está " + opala.estado_funcionamento);
        opala.levar_tiro();
        System.out.println("O carro " + opala.modelo + " levou um tiro e está " + opala.estado_funcionamento);
        
        System.out.println();
        
        System.out.println("O tanque " + tamoio.modelo + ", do ano " + tamoio.ano_fabricacao + ", está " + tamoio.estado_funcionamento);
        System.out.println("O " + tamoio.modelo + " tomou um tiro");
        tamoio.levar_tiro();
        System.out.println("O tanque " + tamoio.modelo + " está " + tamoio.estado_funcionamento);
    }

}
