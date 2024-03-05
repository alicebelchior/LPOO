package Heranca;

public class Carro extends Veiculo {

    String categoria;

    Carro(String m, int a, String cat) {
        super(m, a);
        this.categoria = cat;
    }

}
