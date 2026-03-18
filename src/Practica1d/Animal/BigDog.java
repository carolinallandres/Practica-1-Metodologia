package Practica1d.Animal;

public class BigDog  extends Dog{

    //CONSTRUCTOR

    public BigDog(String name){
        super(name);
    }

    //MÉTODOS

    @Override
    public void greets(){
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog Another){
        System.out.println("Woooooow");
    }

    public void greets(BigDog Another){
        System.out.println("Wooooooooow");
    }
}
