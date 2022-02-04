package com.company;
/** clase fruta
 * @author Jair Rincon */
/** importa libreria arraylist  */
import java.util.ArrayList;

public class Fruit {
    /** atributos  de la fruta  */
    public String name;
    private float average_weight;
    public ArrayList<String> colors;

    /** colocar el color  */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    /** obtener el color de una lista*/
    public ArrayList<String> getColors() {
        return colors;
    }
}
