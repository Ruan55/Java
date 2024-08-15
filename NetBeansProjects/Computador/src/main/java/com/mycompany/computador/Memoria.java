/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computador;

/**
 *
 * @author Aluno
 */
public class Memoria extends Produto{
    
    private int capacidadeDeArmazenamento;

    public Memoria(int capacidadeDeArmazenamento, String marca, String modelo, String frequencia) {
        super(marca, modelo, frequencia);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public int getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }
    
}
