package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.animal_dog_cat_mammal;

public class Mammal extends Animal { //hereda de la clase animal

    //Constructores
    public Mammal(String name) { //inicializa el nombre llamando al constructor de la clase animal
        super(name);
    }


    //Métodos
    @Override
    public String toString() { //devuelve el nombre del mamífero usando la clase animal (super.toString())
        return "Mammal[" + super.toString() + "]";
    }
}
