/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz.coffee;

/**
 * Clase abstracta que representa un decorador de condimentos para una bebida.
 * Extiende la clase Beverage.
 *
 * @author Luis Esteban Durán Quintanar - 00000233267
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * La bebida a la que se le añadirán condimentos.
     */
    public Beverage beverage;

    /**
     * Obtiene la descripción de la bebida decorada con los condimentos.
     *
     * @return La descripción completa de la bebida decorada.
     */
    @Override
    public abstract String getDescription();

    /**
     * Obtiene el tamaño de la bebida decorada.
     *
     * @return El tamaño de la bebida decorada.
     */
    @Override
    public Size getSize() {
        return beverage.getSize();
    }

}
