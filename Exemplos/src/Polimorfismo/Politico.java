package Polimorfismo;

class Politico extends Pessoa {

    String partido;

    Politico(int i, String n, String p) {
        super(i, n);
        this.partido = p;
    }

    void mostrar() {
        System.out.println(nome + " é um político de " + idade + " anos de idade, filiado ao " + partido);
    }
}
