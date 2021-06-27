/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animales;

/**
 *
 * @author Carlos GarMon
 */
public class Gato extends Animal {

    private String raza;
    private String pelaje;
    private int edad;
    private String colorOjos;

    public Gato() {
    }

    public Gato(String raza, String pelaje, int edad, String colorOjos) {
        this.raza = raza;
        this.pelaje = pelaje;
        this.edad = edad;
        this.colorOjos = colorOjos;
    }

    public Gato(String raza, String pelaje, int edad, String colorOjos, int numeroPatas, boolean terrestre, boolean domestico, String tipoRepoduccion) {
        super(numeroPatas, terrestre, domestico, tipoRepoduccion);
        this.raza = raza;
        this.pelaje = pelaje;
        this.edad = edad;
        this.colorOjos = colorOjos;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString() + "\n- GATO -" + "\nRaza: " + raza + "\nPelaje: " + pelaje + "\nEdad: " + edad + " años" + "\nColor de Ojos: " + colorOjos;
    }

    @Override
    public void emitirSonido() {
        super.emitirSonido(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Gato - Maullando...");
    }

}
