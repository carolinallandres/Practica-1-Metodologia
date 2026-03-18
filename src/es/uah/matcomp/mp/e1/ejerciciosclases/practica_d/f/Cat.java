package es.uah.matcomp.mp.e1.ejerciciosclases.practica_d.f;

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}