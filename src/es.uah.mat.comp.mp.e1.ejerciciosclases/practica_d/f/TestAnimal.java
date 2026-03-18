package es.uah.matcomp.mp.e1.ejerciciosclases.practica_d.f;

public class TestAnimal {
    public static void main(String[] args) {
        Animal cat = new Cat("Misu");
        Animal dog = new Dog("Rex");
        Dog dog2 = new Dog("Toby");
        BigDog bigDog = new BigDog("Thor");
        BigDog bigDog2 = new BigDog("Hulk");

        cat.greets();
        dog.greets();
        dog2.greets(dog2);
        bigDog.greets();
        bigDog.greets(dog2);
        bigDog.greets(bigDog2);
    }
}