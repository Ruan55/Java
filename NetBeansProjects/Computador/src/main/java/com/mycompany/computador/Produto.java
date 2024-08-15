/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computador;

/**
 *
 * @author Aluno
 */
public abstract class Produto {
    
    protected String marca;
    protected String modelo;
    protected String frequencia;

    public Produto(String marca, String modelo, String frequencia) {
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
