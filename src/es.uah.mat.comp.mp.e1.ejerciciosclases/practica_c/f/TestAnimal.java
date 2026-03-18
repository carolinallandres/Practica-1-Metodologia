package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.f;

public class TestAnimal {

    public static void main(String[] args) {

        Animal a1 = new Animal("Generic");
        Mammal m1 = new Mammal("Mammalito");
        Cat c1 = new Cat("Misu");
        Dog d1 = new Dog("Firulais");
        Dog d2 = new Dog("Rex");

        System.out.println(a1);
        System.out.println(m1);
        System.out.println(c1);
        System.out.println(d1);

        c1.greets();
        d1.greets();
        d1.greets(d2);
    }
}