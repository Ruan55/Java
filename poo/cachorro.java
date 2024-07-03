package poo;

public class cachorro extends ser2{

    String donoNome;

    public cachorro(String nome, int idade, String donoNome) {
        super(nome, idade);
        this.donoNome = donoNome;
    }

    @Override
    public String saudacao(){

        return "au au au";

    }
    
}
