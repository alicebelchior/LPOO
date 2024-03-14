package TCF;

public class progErrada {

    //metodo executor 
    public static void main(String[] args) {
        //objeto da classe "Errada 2" instanciado
        Errada2 x = new Errada2();
        try { //o objeto vai rodar o que a classe "Errada2" criou
            x.rodar();
        } catch (ArrayIndexOutOfBoundsException e) {
            //a classe aqui está "acima" e vai tratar o erro com um "TRY" e um "CATCH"
            System.out.println("Deu um erro");
        }

    }

}
