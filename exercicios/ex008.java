package exercicios;
import java.util.Scanner;

public class ex008 {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        
        int i;

        for(i = 1; i <= 21; i++){

            if(i % 2 != 0){

                System.out.println("Numeros impares: " + i);

            }

        }

    scanner.close();
    }
    
}
