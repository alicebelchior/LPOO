package Polimorfismo;

public class ProgP {

    public static void main(String[] args) {
        Pessoa[] m = new Pessoa[3];
        m[0] = new Milico(23, "Juca", "Cabo");
        m[1] = new Politico(31, "Joao", "PMDB");
        m[2] = new Milico(56, "Fernandinho", "PTB");
        m[0].mostrar();
        m[1].mostrar();
        m[2].mostrar();
    }
}
