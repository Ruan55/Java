/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computador;

/**
 *
 * @author Aluno
 */
public class Computador {

    public static void main(String[] args) {
    Processador processador1 = new Processador("AMD", "Ryzen 5 5600", "3.5 GHz");
    PlacaMae Placamae1 = new PlacaMae(4, "ASUS", "ROG STRIX B760-F", "16 + 1");
    Memoria memoria1 = new Memoria(32, "Corsair", "Vengeance LPX", "2666MHz");
    DispositivoDeArmazenamento dispositivoDeArmazenamento1 = new DispositivoDeArmazenamento("Sata", "Seagate", "Barracuda Pro Compute 3.5", "3.4W");
    
        System.out.println("\nDados Processador: ");
        System.out.println("Marca: " + processador1.getMarca());
        System.out.println("Modelo: " + processador1.getModelo());
        System.out.println("Frequência: " + processador1.getFrequencia());
    
        System.out.println("\nDados Placa mãe: ");
        System.out.println("Soquete: " + Placamae1.getSoquete());
        System.out.println("Marca: " + Placamae1.getMarca());
        System.out.println("Modelo: " + Placamae1.getModelo());
        System.out.println("Frequência: " + Placamae1.getFrequencia());
        
        System.out.println("\nDados Mémoria: ");
        System.out.println("Capacidade de armazenamento: " + memoria1.getCapacidadeDeArmazenamento());
        System.out.println("Marca: " + memoria1.getMarca());
        System.out.println("Modelo: " + memoria1.getModelo());
        System.out.println("Frequência: " + memoria1.getFrequencia());
        
        System.out.println("\nDados Dispositivo de armazenamento: ");
        System.out.println("Tipo de conexão: " + dispositivoDeArmazenamento1.getTipoDeConexao());
        System.out.println("Marca: " + dispositivoDeArmazenamento1.getMarca());
        System.out.println("Modelo: " + dispositivoDeArmazenamento1.getModelo());
        System.out.println("Frequência: " + dispositivoDeArmazenamento1.getFrequencia());
    }
}
