
package exemplo1;

public class Pessoa {

    //Atributo
    String nome;
    int idade;  

    //Método "construtor"
    Pessoa(String n, int i) {
        this.nome = n;
        this.idade = i;
    }

    void aniversario() {
        this.idade++;
    }

    String dados() {
        return this.nome + " tem " + this.idade + " anos.";
    }
}
