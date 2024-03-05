package Heranca;

public class Veiculo {

    String modelo;
    int ano_fabricacao;
    String estado_funcionamento;

    Veiculo(String m, int a) {
        this.modelo = m;
        this.ano_fabricacao = a;
        this.estado_funcionamento = "Perfeito";
    }

    void levar_tiro() {
        this.estado_funcionamento = "Estragado";
    }
}
