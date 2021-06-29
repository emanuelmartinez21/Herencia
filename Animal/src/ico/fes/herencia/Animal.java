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
public class Animal {
    private int numeroPatas;

    public Animal() {
    }

    public Animal(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

        public void hablar(){
        System.out.println("Depende del animal");
      }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + '}';
    }


    
    
}
