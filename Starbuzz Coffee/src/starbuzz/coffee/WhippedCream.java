/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz.coffee;

/**
 * Clase que representa un condimento de crema batida para una bebida. Extiende
 * la clase CondimentDecorator.
 *
 * @author Luis Esteban Durán Quintanar - 00000233267
 */
public class WhippedCream extends CondimentDecorator {

    /**
     * Constructor de WhippedCream que recibe la bebida a la que se le añadirá
     * crema batida.
     *
     * @param beverage La bebida base a la que se le añadirá crema batida.
     */
    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Obtiene la descripción de la bebida decorada con crema batida.
     *
     * @return La descripción completa de la bebida con crema batida.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", crema batida";
    }

    /**
     * Calcula el costo total de la bebida con el condimento de crema batida.
     *
     * @return El costo total de la bebida con crema batida.
     */
    @Override
    public double cost() {
        double cost = beverage.cost();
        return cost += 5.0; // El costo adicional por la crema batida.
    }

}
