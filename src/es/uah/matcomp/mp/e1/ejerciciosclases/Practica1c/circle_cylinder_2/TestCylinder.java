package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1c.circle_cylinder_2;

public class TestCylinder {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder(); //se declara un cilindro por defecto
        System.out.println(c1);
        System.out.println("Volumen = " + c1.getVolume());

        Cylinder c2 = new Cylinder(2.5, 5.0); //se declara un cilindro por con la altura y el radio determinados
        System.out.println(c2);
        System.out.println("Volumen = " + c2.getVolume());

        // Cilindro con color, radio y altura
        Cylinder c3 = new Cylinder(3.0, "blue", 10.0); //se declara un cilindro por con la altura, el color y el radio determinados
        System.out.println(c3);
        System.out.println("Volumen = " + c3.getVolume());
    }
}