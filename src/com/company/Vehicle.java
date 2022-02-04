package com.company;
/** clase vehiculo
 * @author Jair Rincon */
/** importa libreria arraylist  */
import java.util.ArrayList;

public class Vehicle {
    /** atributos  de un vehiculo */
    public String model;
    private String plate;
    protected String mark;
    public ArrayList<String> colors;

    /** encapsulacion */
    public Vehicle(String model,String plate, String mark, ArrayList<String> colors ){
        this.model=model;
        this.plate=plate;
        this.mark=mark;
        this.colors=colors;
    }
    /** colocar el color  */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    /** colcar el modelo del vehiculo */
    public void setmodel(String model) {
        this.model = model;
    }

}
