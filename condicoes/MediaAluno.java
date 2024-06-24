package condicoes;

public class MediaAluno {

    public static void main(String[] args){

        float nota1 = 10;
        float nota2 = 8;
        float soma = nota1 + nota2;
        float media = soma / 2;

        if (media >= 7){

            System.out.println("Você está aprovado!");

        }

        else if(media >= 5 && media <= 6.9){

            System.out.println("Você está em recuperação!");

        }

        else{

            System.out.println("Você está reprovado!");

        }

    }
    
}
