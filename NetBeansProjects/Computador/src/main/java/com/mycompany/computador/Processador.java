/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computador;

/**
 *
 * @author Aluno
 */
public class Processador extends Produto{
    
    private String marca;
    private String modelo;
    private String frequencia;

    public Processador(String marca, String modelo, String frequencia) {
        super(marca, modelo, frequencia);
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFrequencia() {
        return frequencia;
    }
    
}
