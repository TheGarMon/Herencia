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
public class Animal {
    private int numeroPatas;
    private boolean terrestre;
    private boolean domestico;
    private String tipoRepoduccion;

    public Animal() {
    }

    public Animal(int numeroPatas, boolean terrestre, boolean domestico, String tipoRepoduccion) {
        this.numeroPatas = numeroPatas;
        this.terrestre = terrestre;
        this.domestico = domestico;
        this.tipoRepoduccion = tipoRepoduccion;
    }

    public String getTipoRepoduccion() {
        return tipoRepoduccion;
    }

    public void setTipoRepoduccion(String tipoRepoduccion) {
        this.tipoRepoduccion = tipoRepoduccion;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public boolean isTerrestre() {
        return terrestre;
    }

    public void setTerrestre(boolean terrestre) {
        this.terrestre = terrestre;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    @Override
    public String toString() {
        return "Clase Animal" + "\nNumero de patas: " + numeroPatas + "\nTerrestre: " + terrestre + "\nDomestico: " + domestico + "\nTipo de Repoduccion: " + tipoRepoduccion;
    }
    
    public void emitirSonido(){
        System.out.println("Emitiendo sonido del animal: ");
    }
    
}
