package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1c.animal_dog_cat_mammal;

public class Animal {

    //Atributos
    private String name;


    //Constructores
    public Animal(String name) { //inicializa el nombre
        this.name = name;
    }


    //Métodos
    @Override
    public String toString() { //devuelve el nombre del animal
        return "Animal[name=" + name + "]";
    }
}