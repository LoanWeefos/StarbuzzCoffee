/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz.coffee;

/**
 * Clase que representa un condimento de leche para una bebida. Extiende la
 * clase CondimentDecorator.
 *
 * @author Luis Esteban Durán Quintanar - 00000233267
 */
public class Milk extends CondimentDecorator {

    /**
     * Constructor de Milk que recibe la bebida a la que se le añadirá leche.
     *
     * @param beverage La bebida base a la que se le añadirá leche.
     */
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Obtiene la descripción de la bebida decorada con leche.
     *
     * @return La descripción completa de la bebida con leche.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", leche";
    }

    /**
     * Calcula el costo total de la bebida con el condimento de leche.
     *
     * @return El costo total de la bebida con leche.
     */
    @Override
    public double cost() {
        double cost = beverage.cost();
        return cost += 6.0; // El costo adicional por la leche.
    }

}
