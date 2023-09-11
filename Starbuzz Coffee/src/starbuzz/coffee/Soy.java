/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz.coffee;

/**
 * Clase que representa un condimento de soya para una bebida. Extiende la clase
 * CondimentDecorator.
 *
 * @author Luis Esteban Durán Quintanar - 00000233267
 */
public class Soy extends CondimentDecorator {

    /**
     * Constructor de Soy que recibe la bebida a la que se le añadirá soya.
     *
     * @param beverage La bebida base a la que se le añadirá soya.
     */
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Obtiene la descripción de la bebida decorada con soya.
     *
     * @return La descripción completa de la bebida con soya.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soya";
    }

    /**
     * Calcula el costo total de la bebida con el condimento de soya.
     *
     * @return El costo total de la bebida con soya.
     */
    @Override
    public double cost() {
        double cost = beverage.cost();
        return cost += 16.0; // El costo adicional por la soya.
    }

}
