package Practica1c.Animal;

public class Mammal extends Animal{

    //CONSTRUCTORES

    public Mammal(String name){
        super(name);
    }

    //MÉTODOS

    @Override
    public String toString(){
        return "Mammal"+"["+ super.toString()+"]";
    }
}
