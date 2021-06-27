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
public class Perro extends Animal {
    private String raza;
    private String tamanio;
    private String color;
    private String tipoPelaje;

    public Perro() {
    }

    public Perro(String raza, String tamanio, String color, String tipoPelaje) {
        this.raza = raza;
        this.tamanio = tamanio;
        this.color = color;
        this.tipoPelaje = tipoPelaje;
    }

    public Perro(String raza, String tamanio, String color, String tipoPelaje, int numeroPatas, boolean terrestre, boolean domestico, String tipoRepoduccion) {
        super(numeroPatas, terrestre, domestico, tipoRepoduccion);
        this.raza = raza;
        this.tamanio = tamanio;
        this.color = color;
        this.tipoPelaje = tipoPelaje;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamaño) {
        this.tamanio = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\n- PERRO -" + "\nRaza: " + raza + "\nTamanio: " + tamanio + "\nColor: " + color + "\nTipo de Pelaje: " + tipoPelaje;
    }

    @Override
    public void emitirSonido() {
        super.emitirSonido(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Perro - Ladrando...");
    }
    
    
}
