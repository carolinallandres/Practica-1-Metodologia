package Practica1d.Animal;

public class Dog extends Animal{

    //CONSTRUCTOR

    public Dog(String name){
        super(name);
    }

    //MÉTODOS

    @Override
    public void greets(){
        System.out.println("Woof");
    }

    public void greets(Dog another){
        System.out.println("Woooof");
    }
}
