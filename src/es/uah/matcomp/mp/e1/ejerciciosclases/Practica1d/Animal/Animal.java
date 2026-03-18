package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1d.Animal;

public abstract class Animal {
    private String name;

    //CONSTRUCTORES

    public Animal(String name){
        this.name=name;
    }

    //MÉTODOS ABSTRACTOS

    abstract void greets();
}
