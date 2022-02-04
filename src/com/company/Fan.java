package com.company;
/** clase ventilador
 * @author Jair Rincon */
public class Fan {
    /** atributos  y caracteristicas de un vehiculo */
    public String name;
    public String mark;
    private int n_blades;
    public int n_speed;
    protected boolean activated;
    /** encapsulacion */
    public Fan(String name, String mark, int n_blades,int n_speed, boolean activated){
        this.name=name;
        this.mark=mark;
        this.n_blades=n_blades;
        this.n_speed=n_speed;
        this.activated=activated;
    }
    /** colocar la activacion del ventilador */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    /** obtener el numero de velocidad */
    public int getN_speed() {
        return n_speed;
    }
}
