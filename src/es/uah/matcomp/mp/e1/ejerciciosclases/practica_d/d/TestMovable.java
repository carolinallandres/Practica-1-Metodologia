package es.uah.matcomp.mp.e1.ejerciciosclases.practica_d.d;

public class TestMovable {
    public static void main(String[] args) {

        System.out.println("=== MovablePoint ===");
        Movable p1 = new MovablePoint(5, 10, 2, 3);
        System.out.println("Inicial: " + p1);

        p1.moveUp();
        System.out.println("Después de moveUp: " + p1);

        p1.moveLeft();
        System.out.println("Después de moveLeft: " + p1);

        p1.moveDown();
        System.out.println("Después de moveDown: " + p1);

        p1.moveRight();
        System.out.println("Después de moveRight: " + p1);


        System.out.println("\n=== MovableCircle ===");
        Movable c1 = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println("Inicial: " + c1);

        c1.moveUp();
        System.out.println("Después de moveUp: " + c1);

        c1.moveLeft();
        System.out.println("Después de moveLeft: " + c1);

        c1.moveDown();
        System.out.println("Después de moveDown: " + c1);

        c1.moveRight();
        System.out.println("Después de moveRight: " + c1);


        System.out.println("\n=== Downcasting opcional ===");
        MovablePoint mp = new MovablePoint(3, 3, 1, 1);
        MovableCircle mc = new MovableCircle(10, 10, 2, 2, 4);

        System.out.println("Punto: " + mp);
        System.out.println("Círculo: " + mc);
    }
}