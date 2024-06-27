package poo;

// Classes servem para modelar objetos
public class classesEobjetos1 {

    // Atributos de objetos são variáveis que este objeto tem
    // (Atributos)
    String nome;

    // Atributo estatico
    static String nome2;

    // Quando declaramos metódos do tipo estatico, este método pertence a classe e não as instâncias de objetos

    // Metodos estaticos enxergam atributos estaticos, porém eles não enxergam atributos que vão pertencer a instâncias
    public static void main(String[] args){

        // System.out.println(nome); Um campo não-estático, não pode se referenciar em um contexto estatico

        System.out.println(nome2);
        
    }

    // (Metodos)
    static void teste(){

    }

    // Pode-se referenciar o atributos em todos os metódos que pertencem a instância da classe main

    // É possivel fazer referência a metódos estaticos aqui também
    void declaraNome(){
        System.out.println(nome2);

        // classesEobjetos1.main(); Não é possivel fazer com main pois ele espera argumentos no metodo

        // Já com um novo método é possivel
        classesEobjetos1.teste();
        nome = "Ruan";
        // classesEobjetos1.declaraNome(); Não é possivel pois ele não é estatico

        // Unica forma de fazer isso é dessa maneira:
        //
        classesEobjetos1 declaraNomeMain = new classesEobjetos1();

        // (Objetos)
        declaraNomeMain.declaraNome();
        System.out.println(declaraNomeMain.nome);

    }

    String getNome(){

        return nome;

    }
    
}
