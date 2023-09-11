/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz.coffee;

/**
 * Clase que representa una bebida de café Dark Roast. Extiende la clase
 * Beverage.
 *
 * @author Luis Esteban Durán Quintanar - 00000233267
 */
public class DarkRoast extends Beverage {

    /**
     * Constructor de DarkRoast que establece la descripción de la bebida.
     */
    public DarkRoast() {
        description = "Tostado oscuro";
    }

    /**
     * Calcula el costo de la bebida Dark Roast.
     *
     * @return El costo de la bebida Dark Roast.
     */
    @Override
    public double cost() {
        return 25.0;
    }

}
