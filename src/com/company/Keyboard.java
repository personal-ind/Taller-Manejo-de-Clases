package com.company;
/** clase teclado
 * @author Jair Rincon */
public class Keyboard {
    /** atributos  de un teclado */
    public String model;
    protected String mark;
    public int nkeys;
    private float weight;
    /** encapsulacion */
    public Keyboard(String model, String mark, int nkeys, float weight){
        this.model=model;
        this.mark=mark;
        this.nkeys=nkeys;
        this.weight=weight;
    }
    /** coloar el nombre del modelo del teclado */
    public void setModel(String model) {
        this.model = model;
    }
    /** obtener el peso y encapsularlo */
    public float getWeight() {
        return weight;
    }
}
