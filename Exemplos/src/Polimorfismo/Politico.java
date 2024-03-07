package Polimorfismo;

//criação da sub-classe
class Politico extends Pessoa {

    //atributo
    String partido;
    boolean investigado;

    //metodo construtor
    Politico(int i, String n, String p) {
        super(i, n);// o SUPER roda o método construtor da superclasse (PESSOA)
        this.partido = p;
    }

    //Metodo vazio
    void mostrar() {
        System.out.println(nome + " é um político de " + idade + " anos de idade, filiado ao " + partido);
    }
}
