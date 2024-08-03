import java.util.Scanner;

public class ex010 {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int i;
        
        for(i = 1; i <= 5; i++){

            System.out.println("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if(numero % 2 == 0){

                par++;

            }
            else{

                impar++;

            }

        }

        System.out.println("Numeros pares: " + par);
        System.out.println("Numero impares: " + impar);

    scanner.close();
    }
    
}
