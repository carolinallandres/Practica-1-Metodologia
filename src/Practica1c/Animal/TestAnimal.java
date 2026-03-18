package Practica1c.Animal;

public class TestAnimal {
    public static void main(String[] args) {

        // Crear subclases
        Dog dog1=new Dog("Laika");
        Cat cat1=new Cat("Rigodon");
        Dog dog2=new Dog("Rex");

        System.out.println("--- Subclases ---");
        dog1.greets();
        cat1.greets();

        Animal a1=dog1;
        Animal a2=cat1;

        System.out.println("\n--- Referencias de Animal ---");
        System.out.println(a1);
        System.out.println(a2);

        //a1.greets();
        //NO compila, Animal no tiene greets()

        ((Dog)a1).greets();
        ((Cat)a2).greets();
        ((Dog)a1).greets(dog2);
    }
}