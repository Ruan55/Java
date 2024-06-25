package arraylist;

// Importando o array list
import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args){

        // Declarando a lista do tipo inteiro
        ArrayList<Integer> idade = new ArrayList<Integer>();
        // Adiciona um valor a lista
        idade.add(5);
        idade.add(78);
        idade.add(62);
        // Remove um valor da lista
        idade.remove(0);
        // Pegar um valor da lista
        idade.get(1);
        // Pegar o tamanho da lista
        idade.size();

    }
    
}
