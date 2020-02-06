/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.factory;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Pocetak");
        
        String message = "Ovo je poruka.";
        Car fiat = new Car();
        fiat.model = "Fiat Punto";
        fiat.buildYear = 2010;
        fiat.color = "Black";
        fiat.consumption = 6;
        fiat.maxSpeed = 180;
        fiat.maxFuel = 45;
        fiat.currentFuel = 20;
        
        System.out.println("Model:" + fiat.model);
        System.out.println("BuildYear:" + fiat.buildYear);
        System.out.println("Color:" + fiat.color);
        System.out.println("Consumption" + fiat.consumption);
        System.out.println("MaxSpeed" + fiat.maxSpeed);
    }
    
}
