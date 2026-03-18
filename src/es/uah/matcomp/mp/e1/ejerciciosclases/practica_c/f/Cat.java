package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.f;

public class Cat extends Mammal {

    //Constructores
    public Cat(String name) {
        super(name);
    }


    public void greets() {System.out.println("Meow");}


    //Métodos
    @Override
    public String toString() {return "Cat[" + super.toString() + "]";}
}
