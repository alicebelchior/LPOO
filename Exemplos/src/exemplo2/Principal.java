
package exemplo2;

public class Principal {

    /*
        ACRESCENTAR NA CLASSE "Pessoa" 2 ATRIBUTOS.
        FAZER ALTERAÇÃO NO MÉTODO CONSTRUTOR PRA RECEBER NA CRIAÇÃO DO OBJETO OS DOS ATRIBUTOS NOVOS.
        CORRIGIR O MPETODO "Dados" PARA QUE ELE USE OS NOVOS ATRIBUTOS.
        CRIAR MAIS DOIS MÉTODOS USANDO OS ATRIBUTOS CRIADOS E, SE QUISER, OS QUE JÁ EXISTIAM.
        CORRIGIR A CRIAÇÃO DE OBJETOS NA CLASSE PRINCIPAL.
        USAR OS MÉTODOS CRIADOS NOS OBJETOS DA CLASSE PRINCIPAL.
     */
    public static void main(String[] args) {
        
        //criação dos objetos
        Pessoa a = new Pessoa("Alice", "brasileira", 28, (float) 1.54);
        Pessoa b = new Pessoa("Érica", "brasileira", 24, (float) 1.84);
        Pessoa c = new Pessoa("Édipo", "brasileiro", 25, (float) 1.87);
        Pessoa d = new Pessoa("Matheus", "brasileiro", 26, (float) 1.65);
        
        //listando os dados chamando o metodo dados()
        System.out.println(a.dados());
        System.out.println(b.dados());
        System.out.println(c.dados());
        System.out.println(d.dados());
        System.out.println();
        
        //os objetos fazem aniversario
        a.aniversario();
        b.aniversario();
        c.aniversario();
        d.aniversario();
        
        //a cada aniversário, mudam-se as alturas dos objetos
        a.altura();
        b.altura();
        c.altura();
        d.altura();
        
        //outro método é chamado para informar a nova altura
        System.out.println(a.frase());
        System.out.println(b.frase());
        System.out.println(c.frase());
        System.out.println(d.frase());
    }
    
}
