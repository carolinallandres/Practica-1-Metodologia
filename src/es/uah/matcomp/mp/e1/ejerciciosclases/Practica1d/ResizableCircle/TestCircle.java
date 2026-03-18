package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1d.ResizableCircle;

public class TestCircle {

    public static void main(String[] args) {
        // Crear un círculo
        Circle c1=new Circle(5.0);
        // Mostrar información
        System.out.println(c1);
        // Mostrar área
        System.out.println("Área: "+c1.getArea());
        // Mostrar perímetro
        System.out.println("Perímetro: "+c1.getPerimeter());
    }
}