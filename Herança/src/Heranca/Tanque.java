package Heranca;

public class Tanque extends Veiculo{

        int calibre_canhao;

        Tanque(String m, int a, int cal) {
            super(m, a);
            this.calibre_canhao = cal;
        }

        void levar_tiro() {
            this.estado_funcionamento = "Meio avariado";
            System.out.println("Haha! Otário! Nem doeu!");
}

}
