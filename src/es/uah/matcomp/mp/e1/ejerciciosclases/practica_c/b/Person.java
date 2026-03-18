package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.b;

public class Person {

    //Atributos
    private String name;
    private String address;


    //Constructores
    public Person(String name, String address) { //constructor que permite inicializar el valor del nombre y la dirección
        this.name=name;
        this.address=address;
    }


    //Métodos básicos
    public String getName() { //devuelve el nombre
        return name;
    }

    public String getAddress() { //devuelve el valor de la dirección
        return address;
    }

    public void setAddress(String address) { //modifica el valor de la dirección
        this.address=address;
    }


    //Métodos con función
    @Override
    public String toString() { //devuelve los atributos de la persona
        return "Person[name="+name+", address="+address+"]";
    }
}