package Heranca;

public class Jetski extends Veiculo{
    //atributo
    String local;
    
    //metodos
    Jetski(String m, int a, String l) {
        // o SUPER roda o método construtor da superclasse (VEICULO)
        super(m, a);
        this.local = l;
    }
    
    //metodo que retorna uma frase
    String dados(){
        return "As jetskis " + this.modelo + " são como as motos";
    }
}
