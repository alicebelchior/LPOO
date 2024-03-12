package Polimorfismo;

public class ProgP {

    public static void main(String[] args) {
        Pessoa[] m = new Pessoa[13]; //vetor declarado de pessoas
        //cada posição com varios tipos de pessoas
        //milico
        m[0] = new Milico(23, "Juca", "Cabo", "Rio de Janeiro");
        m[1] = new Milico(50, "Rezende", "Major", "Vitória");
        m[2] = new Milico(65, "Oliveira", "General", "São Paulo");
        
        //politico
        m[3] = new Politico(31, "Joao", "PMDB", (float) 98765.65);
        m[4] = new Politico(56, "Fernandinho", "PTB", (float) 123456.65);
        m[5] = new Politico(35, "Lule", "Trabalhadores", (float) 142536.56);
        
        //professor
        m[6] = new Professor(20, "Luisa", "Português");
        m[7] = new Professor(5, "Alberto", "Química");
        m[8] = new Professor(10, "Thamirys", "Física");
        
        //estagiario
        m[9] = new Estagiario(28,"Alice", "Informática", 80);
        m[10] = new Estagiario(18,"Pedro", "Administração", 74);
        m[11] = new Estagiario(40,"Jonas", "Logística", 93);
        
        
        //saida de dado de cada sub-classe
        m[0].mostrar();
        m[1].mostrar();
        m[2].mostrar();
        m[3].mostrar();
        m[4].mostrar();
        m[5].mostrar();
        m[6].mostrar();
        m[7].mostrar();
        m[8].mostrar();
        m[9].mostrar();
        m[10].mostrar();
        m[11].mostrar();
    }
}
