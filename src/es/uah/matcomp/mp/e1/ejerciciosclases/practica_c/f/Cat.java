package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.f;

public class Cat extends Mammal { //hereda de la clase mamíferos

    //Constructores
    public Cat(String name) { //inicializa el nombre del gato llamando al constructor de la clase mamíferos (super())
        super(name);
    }


    public void greets() { //imprime el maullido de un gato
        System.out.println("Meow");
    }


    //Métodos
    @Override
    public String toString() { //devuelve el nombre del gato utilizando la clase mamíferos (super.toString())
        return "Cat[" + super.toString() + "]";
    }
}
