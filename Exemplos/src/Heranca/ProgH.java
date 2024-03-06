package Heranca;

public class ProgH {

    public static void main(String[] args) {
        //objetos
        Carro opala = new Carro("Opala", 1988, "Luxo");
        Carro honda = new Carro("Civic", 2020, "esportivo");
        
        Tanque tamoio = new Tanque("Tamoio", 1999, 50);
        Tanque leopard = new Tanque("Leopard 2A7", 2014, 120);
        
        Jetski seadoo = new Jetski("Spark Trixx", 2024, "baía de Vitória");
        Jetski polaris = new Jetski("Superjet", 2024, "balneário Ponta da Fruta");

        //saida de dados do opala
        System.out.println("O carro " + opala.modelo + ", da categoria " + opala.categoria + ", está " + opala.estado_funcionamento);
        opala.levar_tiro();
        System.out.println("O carro " + opala.modelo + " levou um tiro e está " + opala.estado_funcionamento);
        System.out.println();
        //honda
        System.out.println("O carro " + honda.modelo + ", da categoria " + honda.categoria + ", está " + honda.estado_funcionamento);
        opala.levar_tiro();
        System.out.println("O carro " + honda.modelo + " levou um tiro e está " + honda.estado_funcionamento);

        System.out.println();

        //saida de dados do tamoio
        System.out.println("O tanque " + tamoio.modelo + ", do ano " + tamoio.ano_fabricacao + ", está " + tamoio.estado_funcionamento);
        System.out.println("O " + tamoio.modelo + " tomou um tiro");
        tamoio.levar_tiro();
        System.out.println("O tanque " + tamoio.modelo + " está " + tamoio.estado_funcionamento);
        System.out.println();
        //leopard
        System.out.println("O tanque " + leopard.modelo + ", do ano " + leopard.ano_fabricacao + ", está " + leopard.estado_funcionamento);
        System.out.println("O " + leopard.modelo + " tomou um tiro");
        leopard.levar_tiro();
        System.out.println("O tanque " + leopard.modelo + " está " + leopard.estado_funcionamento);

        System.out.println();

        //saida de dados da seadoo
        System.out.println("A jetski modelo " + seadoo.modelo + seadoo.ano_fabricacao + " é a mais moderna navegando a " + seadoo.local);
        System.out.println("Mas cuidado!");
        System.out.println(seadoo.dados());
        System.out.println();
        //polaris
        System.out.println("A jetski modelo " + polaris.modelo + polaris.ano_fabricacao + " é a mais moderna navegando a " + polaris.local);
        System.out.println("Mas cuidado!");
        System.out.println(polaris.dados());
    }

}
