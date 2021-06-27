/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import ico.fes.animales.Animal;
import ico.fes.animales.Gato;
import ico.fes.animales.Perro;

/**
 *
 * @author Carlos GarMon
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Animal pet1 = new Perro("Labrador Retriever", "Mediano", "Beige", "Corto", 4, true, true, "Viviparo");
        Animal pet2 = new Gato("Gato Persa", "Largo", 4, "Azules", 4, true, true, "Viviparo");
        
        System.out.println("---------- ANIMALES ---------- \n");
        System.out.println(pet1 + "\n");
        pet1.emitirSonido();
        System.out.println("\n-----------------------------");
        System.out.println(pet2 + "\n");
        pet2.emitirSonido();
    }
    
}
