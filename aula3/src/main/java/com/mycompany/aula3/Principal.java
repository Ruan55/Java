/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula3;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Clientes cliente = new Clientes();
        
        // cliente.nome = "Ruan";
        cliente.setNome("Ruan");
        // cliente.idade = 21;
        cliente.setIdade(21);
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
            
   }
    
 }
