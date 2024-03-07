package Polimorfismo;

//criação da sub-classe
class Estagiario extends Pessoa{
    
    //atributo
    String curso;
    float coeficienteRendimento;
    
    //metodo construtor
    Estagiario(int i, String n, String c, float cr) {
        super(i, n); // o SUPER roda o método construtor da superclasse (PESSOA)
        this.curso = c;
        this.coeficienteRendimento = cr;
    }
    //metodo vazio
    void mostrar(){
        System.out.println(nome + " é aluno de " + curso + " e estagia por ter um CR = " + coeficienteRendimento);
    }
}
