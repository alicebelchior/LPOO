package TCF;

public class Errada2 {

    //metodo vazio informado os erros à classe que instanciou
    void rodar() throws ArrayIndexOutOfBoundsException {
        /*essa classe não vai tratar os erros. 
        Ela vai jogar esses erros para a classe principal (progErrada2)
        A declaração do "THROWS" vai aqui, na classe onde o erro pode ocorrer
         */
        int[] x = new int[4];
        for (int c = 0; c < 10; c++) {
            x[c] = c;
            System.out.println(x[c]);
        }
    }
}
