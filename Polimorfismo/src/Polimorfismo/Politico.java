package Polimorfismo;

//criação da sub-classe
class Politico extends Pessoa {

    //atributo
    String partido;
    float emenda;

    //metodo construtor
    Politico(int i, String n, String p, float ep) {
        super(i, n);// o SUPER roda o método construtor da superclasse (PESSOA)
        this.partido = p;
        this.emenda = ep;
    }

    //Metodo vazio
    void mostrar() {
        System.out.println(nome + " é um político de " + idade + " anos de idade, filiado ao " + partido + " e recebeu uma emenda parlamentar de R$" + emenda);
    }
}
