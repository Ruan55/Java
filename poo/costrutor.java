package poo;

public class costrutor {

    String nome;
    int idade;

    static String nome2;

    public static void main(String[] args){
        
    }

    // Construtores são métodos da classe vão ser chamados para inicializar uma instância desta classe
    public costrutor(String nome){

        this.nome = nome;

    }

    // Podemos receber mais de 1 tipo de argumento
    // (Construtor com parâmetrizado)
    public costrutor(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }
    
}

class pessoa{

    void criaMain(){

        costrutor construtorMain = new costrutor("Ruan", 21);
        System.out.println(construtorMain.nome);
    }

}
