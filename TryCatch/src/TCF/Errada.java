package TCF;

//Tratamento de erros e exceções - exemplo
public class Errada {
    //metodo executor
    public static void main(String[] args) {
        //vetor xcom 4 lugares
        int[] x = new int[4];
        for (int c = 0; c < 10; c++) {
            try { //tenta executar
                x[c] = c;
                System.out.println(x[c]);
            } catch (ArrayIndexOutOfBoundsException e) { //se houver erro, printa o erro
                System.out.println(e);
            } finally { //dando certo ou errado, no final printa essa mensagem
                System.out.println("Terminou um ciclo.");
            }
        }
    }

}
