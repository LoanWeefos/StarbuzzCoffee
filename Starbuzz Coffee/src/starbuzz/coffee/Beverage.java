/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz.coffee;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase abstracta que representa una bebida.
 *
 * @author Luis Esteban Durán Quintanar - 00000233267
 */
public abstract class Beverage {

    /**
     * Enumeración que define los tamaños de la bebida.
     */
    public enum Size {
        CHICO, GDE, JUMBO
    };

    Size size = Size.CHICO; // Tamaño por defecto
    String description = "Café no establecido"; // Descripción por defecto

    // Mapa para mapear tamaños a descripciones
    private static final Map<Size, String> SIZE_DESCRIPTIONS = new HashMap<>();

    static {
        SIZE_DESCRIPTIONS.put(Size.CHICO, "Chico");
        SIZE_DESCRIPTIONS.put(Size.GDE, "Gde");
        SIZE_DESCRIPTIONS.put(Size.JUMBO, "Jumbo");
    }

    /**
     * Obtiene la descripción de la bebida, que incluye el tamaño.
     *
     * @return La descripción completa de la bebida.
     */
    public String getDescription() {
        String sizeDescription = SIZE_DESCRIPTIONS.getOrDefault(size, "");
        return description + " " + sizeDescription;
    }

    /**
     * Establece el tamaño de la bebida.
     *
     * @param size El tamaño de la bebida (CHICO, GDE o JUMBO).
     */
    public void setSize(Size size) {
        this.size = size;
    }

    /**
     * Obtiene el tamaño actual de la bebida.
     *
     * @return El tamaño actual de la bebida.
     */
    public Size getSize() {
        return this.size;
    }

    /**
     * Calcula y devuelve el costo de la bebida. Este método debe ser
     * implementado por las clases concretas que heredan de Beverage.
     *
     * @return El costo de la bebida.
     */
    public abstract double cost();
}
