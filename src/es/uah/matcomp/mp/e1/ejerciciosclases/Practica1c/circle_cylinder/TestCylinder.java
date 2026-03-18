package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1c.circle_cylinder;

public class TestCylinder {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder(); //el primer cilindro utiliza los parámetros por defecto
        System.out.println("Cilindro: radio=" + c1.getRadius() + " altura=" + c1.getHeight() + " base del area=" + c1.getArea() + " volumen=" + c1.getVolume());

        Cylinder c2 = new Cylinder(10.0); //del segundo cilindro modificamos el la altura
        System.out.println("Cilindro: radio=" + c2.getRadius() + " altura=" + c2.getHeight() + " base del area=" + c2.getArea() + " volumen=" + c2.getVolume());

        Cylinder c3 = new Cylinder(2.0, 10.0); //del tercer cilindro modificamos el ladio y la altura
        System.out.println("Cilindro: radio=" + c3.getRadius() + " altura=" + c3.getHeight() + " base del area=" + c3.getArea() + " volumen=" + c3.getVolume());
    }
}