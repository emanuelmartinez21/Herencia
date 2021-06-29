/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author Fatima
 */
public class Gato extends Animal{
    private String raza;

    public Gato() {
    }

    public Gato(String raza) {
        this.raza = raza;
    }

    public Gato(String raza, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void hablar(){
        System.out.println("Miau");
    }
}
