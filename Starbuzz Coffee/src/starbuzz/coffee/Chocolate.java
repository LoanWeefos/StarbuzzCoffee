/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz.coffee;

/**
 * Clase que representa un condimento de chocolate para una bebida. Extiende la
 * clase CondimentDecorator.
 *
 * @author Luis Esteban Durán Quintanar - 00000233267
 */
public class Chocolate extends CondimentDecorator {

    /**
     * Constructor de Chocolate que recibe la bebida a la que se le añadirá
     * chocolate.
     *
     * @param beverage La bebida base a la que se le añadirá chocolate.
     */
    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Obtiene la descripción de la bebida, incluyendo el chocolate.
     *
     * @return La descripción completa de la bebida con chocolate.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", chocolate";
    }

    /**
     * Calcula el costo total de la bebida con el condimento de chocolate.
     *
     * @return El costo total de la bebida con chocolate.
     */
    @Override
    public double cost() {
        double cost = beverage.cost();
        return cost += 10.0; // El costo adicional por el chocolate.
    }
}
