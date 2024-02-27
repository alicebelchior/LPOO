
package exemplo1;

public class Principal {

    public static void main(String[] args) {
//        Pessoa x;
//        x = new Pessoa("João", 25);
//        String texto;
//        texto = x.dados();
//        System.out.println(texto);    
//        x.aniversario();
//        texto = x.dados();
//        System.out.println(texto);
    
        //versão reduzida do anterior
        Pessoa x = new Pessoa("João", 25);
        System.out.println(x.dados());
        x.aniversario();
        System.out.println(x.dados());
        System.out.println();
        
        
        /*
        Criar 4 objetos, listar seus dados.
        Fazer aniversário em 2 objetos e listar novamente os 4 objetos
        */
        
        // Criação dos objetos
        Pessoa a = new Pessoa("Alice", 28);        
        Pessoa b = new Pessoa("Fabs Luiza", 24);
        Pessoa c = new Pessoa("Rafael", 26);
        Pessoa d = new Pessoa("Édipo", 25);
        
        //Listagem dos dados
        System.out.println(a.dados());
        System.out.println(b.dados());
        System.out.println(c.dados());
        System.out.println(d.dados());
        System.out.println();
        
        
        //Dois objetos fazem aniversário
        a.aniversario();
        c.aniversario();
        
        //Listagem dos dados
        System.out.println(a.dados());
        System.out.println(b.dados());
        System.out.println(c.dados());
        System.out.println(d.dados());
        System.out.println();        
        
    }
    
}
