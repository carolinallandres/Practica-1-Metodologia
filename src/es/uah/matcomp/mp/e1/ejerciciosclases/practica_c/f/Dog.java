package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.f;

public class Dog extends Mammal {

    //Constructores
    public Dog(String name) {
        super(name);
    }


    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }


    //Métodos
    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
