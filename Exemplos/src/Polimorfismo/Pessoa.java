package Polimorfismo;

abstract class Pessoa {

    int idade;
    String nome;

    Pessoa(int i, String n) {
        this.idade = i;
        this.nome = n;
    }

    abstract void mostrar();
}