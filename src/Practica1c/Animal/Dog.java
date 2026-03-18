package Practica1c.Animal;

public class Dog extends Mammal{

    //CONSTRUCTORES

    public Dog (String name){
        super(name);
    }

    //MÉTODOS

    public void greets(){
        System.out.println("Woof");
    }

    public void greets(Dog another){
        System.out.println("Woooof");
    }

    public String toString(){
        return "Dog["+super.toString()+"]";
    }
}
