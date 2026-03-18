package Practica1d.Animal;

public class Cat extends Animal{

    //CONSTRUCTOR

    public Cat(String name){
        super(name);
    }

    //MÉTODOS

    @Override
    public void greets(){
        System.out.println("Meow");
    }
}
