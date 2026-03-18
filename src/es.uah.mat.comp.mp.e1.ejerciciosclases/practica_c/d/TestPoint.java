package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.d;

public class TestPoint {

    public static void main(String[] args) {

        Point p1 = new Point(2.5f, 3.5f);
        System.out.println("Point: " + p1);

        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("MovablePoint inicial: " + mp1);

        mp1.move();
        System.out.println("MovablePoint después de mover: " + mp1);

        mp1.move().move();
        System.out.println("MovablePoint tras mover dos veces más: " + mp1);
    }
}