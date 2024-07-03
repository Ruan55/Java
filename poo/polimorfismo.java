package poo;

// Polimorfismo diz respeito a habilidade de objetos de diferentes classes, responderem a mesma mensagem de maneiras diferentes

public class polimorfismo extends ser2{

        String sobrenome;
    
        // Construtor da class "heranca"
        public polimorfismo(String nome, int idade, String sobrenome){
    
            super(nome, idade);
            this.sobrenome = sobrenome;
    
        }
    
        void criaMain(){
        
            modificadoresDeAcesso meuMain = new modificadoresDeAcesso();
            System.out.println(meuMain.name);
            System.out.println(meuMain.getMeuSalario()); 
            this.idade = 21;
        
        }

        @Override
        public String saudacao(){

            return "Olá, meu nome é " + this.nome;

        }
    
}
