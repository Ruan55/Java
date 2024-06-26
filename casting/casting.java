package casting;

public class casting {

    public static void main(String[] args){

        // Cashing implicito
        int idade1 = 22;
        double idade2 = idade1;

        // Cashing explicito
        idade1 = (int) idade2;

        // Cashing com caracteres e strings
        char letra = 'k';
        String nome = String.valueOf(letra);
        letra = nome.charAt(0);

        // Convertendo String em inteiro
        String nome2 = String.valueOf(idade1);
        idade1 = Integer.parseInt(nome2);
    }
    
}
