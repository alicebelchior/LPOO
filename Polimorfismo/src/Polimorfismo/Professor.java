package Polimorfismo;

//criação da sub-classe
class Professor extends Pessoa {

    //atributo
    String disciplina;

    //metodo construtor
    Professor(int i, String n, String d) {
        super(i, n); // o SUPER roda o método construtor da superclasse (PESSOA)
        this.disciplina = d;
    }

    //metodo vazio
    void mostrar() {
        System.out.println(nome + " é professor de " + disciplina + " e tem " + idade + " de sala de aula");
    }

}
