/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livro;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
    Livros livro1 = new Livros("O assassinato no expresso oriente", " Agatha Christie", 240, 23.13);
    Livros livro2 = new Livros("A Arte da Guerra", "Sun Tzu", 160, 10.73);
        
        System.out.println("Titulo: " + livro1.getTitulo());
    
    }
}
