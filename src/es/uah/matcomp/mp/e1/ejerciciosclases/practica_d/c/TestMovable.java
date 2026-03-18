package es.uah.matcomp.mp.e1.ejerciciosclases.practica_d.c;

public class TestMovable {
    public static void main(String[] args) {

        Movable m1 = new MovablePoint(5, 10, 2, 3);
        System.out.println(m1);   // posición inicial

        m1.moveUp();
        System.out.println("Después de moveUp: " + m1);

        m1.moveLeft();
        System.out.println("Después de moveLeft: " + m1);

        m1.moveDown();
        System.out.println("Después de moveDown: " + m1);

        m1.moveRight();
        System.out.println("Después de moveRight: " + m1);

        // Downcasting opcional
        MovablePoint p1 = (MovablePoint) m1;
        System.out.println("Acceso directo al punto: " + p1);
    }
}