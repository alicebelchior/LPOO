package Polimorfismo;

//criação da sub-classe
class Milico extends Pessoa {

    //atributo
    String patente;
    String cidade;

    //metodo construtor
    Milico(int i, String n, String p, String city) {
        super(i, n); // o SUPER roda o método construtor da superclasse (PESSOA)
        this.patente = p;
        this.cidade = city;
    }

    //Metodo vazio
    void mostrar() {
        System.out.println(nome + " é um " + patente + " cuja idade é " + idade + " anos.");
    }
}
