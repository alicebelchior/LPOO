
package exemplo2;

public class Pessoa {
    //Atributo
    String nome;
    String nacionalidade;
    int idade;
    float altura;
    

    //Método construtor (tem o mesmo nome da classe)
    Pessoa(String n, String nac, int i, float alt) {
        this.nome = n;
        this.idade = i;
        this.altura = alt;
        this.nacionalidade = nac;
    }

    //método comum, por ser void nao retorna nada
    void aniversario() {
        this.idade++;
    }

    //metodo comum, retorna uma string
    String dados() {
        return this.nome + " tem " + this.idade + " anos, é " + this.nacionalidade + " e mede " + this.altura + " m.";
    }
    
    //metodo comum que não retorna nada
    void altura(){
        this.altura -= 0.01;
    }
    
    //metodo comum que retorna uma string
    String frase(){
        return this.nome + " por ter feito " + this.idade + " diminuiu 0,01 cm no último ano, passando a ter " + this.altura + " m.";
    }
    
}
