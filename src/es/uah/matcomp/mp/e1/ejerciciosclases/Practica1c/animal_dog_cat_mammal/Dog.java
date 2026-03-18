package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1c.animal_dog_cat_mammal;

public class Dog extends Mammal { //hereda de la clase mamífero

    //Constructores
    public Dog(String name) {  //inicializa el nombre del perro llamando al constructor de la clase mamífero (super())
        super(name);
    }


    //Métodos
    public void greets() { //devuelve el ladrido de un perro
        System.out.println("Woof");
    }

    public void greets(Dog another) { //sobrecarga el metodo anterior para recibir otro perro como parametro y ladrar diferente
        System.out.println("Woooof");
    }

    @Override
    public String toString() { //devuelve el nombre del perro utilizando la clase mamífero (super.toString())
        return "Dog[" + super.toString() + "]";
    }
}
