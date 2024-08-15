/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computador;

/**
 *
 * @author Aluno
 */
public class PlacaMae extends Produto{
    
    private int soquete;

    public PlacaMae(int soquete, String marca, String modelo, String frequencia) {
        super(marca, modelo, frequencia);
        this.soquete = soquete;
    }

    public int getSoquete() {
        return soquete;
    }
    
    
}
