/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz.coffee;

/**
 * Clase que representa una bebida de café Espresso. Extiende la clase Beverage.
 *
 * @author Luis Esteban Durán Quintanar - 00000233267
 */
public class Expresso extends Beverage {

    /**
     * Constructor de Espresso que establece la descripción de la bebida.
     */
    public Expresso() {
        description = "Espresso";
    }

    /**
     * Calcula el costo de la bebida Espresso.
     *
     * @return El costo de la bebida Espresso.
     */
    @Override
    public double cost() {
        return 20.0;
    }

}
