package com.company;
/** agrega las libreria de fecha  */
import java.util.Date;
/** se crea la clase persona y se agrega sus atgributos
 * String para carateres tipo char , Date para fecha y float para numeros reales */
public class Person {
    public String name;
    public String last_name1;
    public String last_name2;
    public Date date_birth;
    public float height;

    /** encapsulacion */
    public Person(String name, String last_name1, String last_name2, Date date_birth, float height){
        this.name=name;
        this.last_name1=last_name1;
        this.last_name2=last_name2;
        this.date_birth=date_birth;
        this.height=height;
    }
    /** colocar el nombre al atributo */
    public void setName(String name) {
        this.name = name;
    }
    /** tomar el combnre y encapsularlo */
    public String getName() {
        return name;
    }
}

