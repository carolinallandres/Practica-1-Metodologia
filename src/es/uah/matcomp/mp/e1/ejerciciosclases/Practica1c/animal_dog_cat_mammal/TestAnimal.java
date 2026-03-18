package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1c.animal_dog_cat_mammal;

public class TestAnimal {

    public static void main(String[] args) {

        Animal a1 = new Animal("General"); //se declaran animales para comprobar si las distintas clases funcionan
        Mammal m1 = new Mammal("Mamífero");
        Cat c1 = new Cat("Michi");
        Dog d1 = new Dog("Perrete");
        Dog d2 = new Dog("Max");

        System.out.println(a1);
        System.out.println(m1);
        System.out.println(c1);
        System.out.println(d1);

        c1.greets();     // saludo del gato
        d1.greets();     // saludo del perro
        d1.greets(d2);   // saludo del primer perro con el segundo perro
    }
}
