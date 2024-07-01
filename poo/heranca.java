package poo;

/* A herança é um princípio da POO que permite a criação de novas classes a partir de outras previamente criadas. Essas novas classes são chamadas de subclasses, ou classes derivadas; */

// Super classe
class ser{

    String nome;
    int idade;

    public ser(String nome, int idade){

        this.idade = idade;
        this.nome = nome;

    }

    void setNome(String nome){

        this.nome = nome;

    }

    void setIdade(int idade){

        this.idade = idade;

    }

}

// Sub classe
// A classe "heranca" está herdando atributos e metodos da classe "ser" através do extends
public class heranca extends ser{

    String sobrenome;

    // Construtor da class "heranca"
    public heranca(String nome, int idade, String sobrenome){

        super(nome, idade);
        this.sobrenome = sobrenome;

    }

    void criaMain(){
    
        modificadoresDeAcesso meuMain = new modificadoresDeAcesso();
        System.out.println(meuMain.name);
        System.out.println(meuMain.getMeuSalario()); 
        this.idade = 21;
    
    }
    
}
    

