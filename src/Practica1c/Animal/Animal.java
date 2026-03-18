package Practica1c.Animal;

public class Animal {
    private String name;

    //CONSTRUCTORES

    public Animal (String name){
        this.name=name;
    }

    //MÉTODOS

    public String toString() {
        return "Animal[name="+name+"]";
    }
}
