/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starbuzz.coffee;

/**
 * Clase principal que demuestra el uso del patrón Decorator para crear y
 * decorar bebidas.
 *
 * @author Luis Esteban Durán Quintanar - 00000233267
 */
public class Main {

    /**
     * El método principal de la aplicación.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este
     * caso).
     */
    public static void main(String[] args) {
        Beverage bebida1 = new Expresso();
        System.out.println(bebida1.getDescription() + ": $" + bebida1.cost());

        Beverage bebida2 = new DarkRoast();
        bebida2.setSize(Beverage.Size.GDE);
        bebida2 = new Milk(bebida2);
        System.out.println(bebida2.getDescription() + ": $" + bebida2.cost());

        Beverage bebida3 = new HouseBlend();
        bebida3.setSize(Beverage.Size.JUMBO);
        bebida3 = new Soy(bebida3);
        bebida3 = new WhippedCream(bebida3);
        System.out.println(bebida3.getDescription() + ": $" + bebida3.cost());
    }

}
