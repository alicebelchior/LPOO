
package exemplo1;

public class Pessoa {

    //Atributo
    String nome;
    String nacionalidade;
    int idade;
    float altura;
    

    //Método "construtor"
    Pessoa(String n, String nac, int i, float alt) {
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
