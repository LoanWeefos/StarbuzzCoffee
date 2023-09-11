/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz.coffee;

/**
 * Clase que representa una bebida de café House Blend. Extiende la clase
 * Beverage.
 *
 * @author Luis Esteban Durán Quintanar - 00000233267
 */
public class HouseBlend extends Beverage {

    /**
     * Constructor de HouseBlend que establece la descripción de la bebida.
     */
    public HouseBlend() {
        description = "Mezcla de la casa";
    }

    /**
     * Calcula el costo de la bebida House Blend.
     *
     * @return El costo de la bebida House Blend.
     */
    @Override
    public double cost() {
        return 30.0;
    }

}
