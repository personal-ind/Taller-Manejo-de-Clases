package com.company;
/** clase cuenta bancaria
 * @author Jair Rincon */
public class Bank_account {
    /** atributos  de la tarjeta de credito */
    private int account_Number;   /** el numero de cuenta es un entero */
    protected boolean activated; /** Este parametro es boobleano, 1 si es true o un 0 si es false*/

    public Bank_account(int account_Number, boolean activated){
        this.account_Number=account_Number;
        this.activated=activated;
    }

    /** metodo para activar la tarjeta de credito*/
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    /** metodo para obtener el valor de la tarjeta de credito*/
    public boolean getActivated(){
        return activated;
    }
}