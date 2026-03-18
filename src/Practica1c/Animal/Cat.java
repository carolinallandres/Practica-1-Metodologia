package Practica1c.Animal;

public class Cat extends Mammal{

    //CONSTRUCTORES

    public Cat (String name){
        super(name);
    }

    //MÉTODOS

    public void greets(){
        System.out.println("Meow");
    }

    @Override
    public String toString(){
        return "Cat["+super.toString()+"]";
    }
}
