package Polimorfismo;

//criação da classe
abstract class Pessoa {

    //atributos
    int idade;
    String nome;

    //método construtor
    Pessoa(int i, String n) {
        this.idade = i;
        this.nome = n;
    }
    
    //metodo vazio
    abstract void mostrar();
}
