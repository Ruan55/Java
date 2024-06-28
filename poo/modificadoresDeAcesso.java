package poo;

public class modificadoresDeAcesso {

    // Visivel para todas as outras classes
    public String name;

    // Visivel apenas para a instância modificadoresDeAcesso
    private int meuSalario;


    public static void main(String[] args){

    }

    /* 
    
    Na Linguagem Java, há dois níveis de modificadores de acesso:

    Nível superior:
    Aplicados a classes;
    São os seguintes modificadores:
    public; e
    default;
    Sem modificador explícito; e

    Nível de membro:
    Aplicados a:
    Atributos; e
    Métodos;
    São os seguintes modificadores:
    private;
    public;
    protected;
    default;
    Sem modificador explícito.
    
    */

    private void atualizaSalario(){

        this.meuSalario = 2000;

    }

    public int getMeuSalario(){

        this.atualizaSalario();
        return this.meuSalario;

    }
    
}

class Pessoa{

    void criaMain(){

        modificadoresDeAcesso meuMain = new modificadoresDeAcesso();
        System.out.println(meuMain.name);
        System.out.println(meuMain.getMeuSalario()); 

    }

}
