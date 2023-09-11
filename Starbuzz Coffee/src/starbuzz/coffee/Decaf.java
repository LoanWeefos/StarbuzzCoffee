/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz.coffee;

/**
 * Clase que representa una bebida de café Descafeinado. Extiende la clase
 * Beverage.
 *
 * @author Luis Esteban Durán Quintanar - 00000233267
 */
public class Decaf extends Beverage {

    /**
     * Constructor de Decaf que establece la descripción de la bebida.
     */
    public Decaf() {
        description = "Descafeinado";
    }

    /**
     * Calcula el costo de la bebida Decaf.
     *
     * @return El costo de la bebida Decaf.
     */
    @Override
    public double cost() {
        return 25.0;
    }

}
