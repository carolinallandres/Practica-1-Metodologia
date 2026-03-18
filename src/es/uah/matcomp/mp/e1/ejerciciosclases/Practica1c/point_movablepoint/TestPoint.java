package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1c.point_movablepoint;

public class TestPoint {

    public static void main(String[] args) {

        Point p1 = new Point(2.5f, 3.5f); //se declara un punto con dos coordenadas
        System.out.println("Punto: " + p1);

        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f); //como el punto se puede mover, le asigno nuevas coordenadas y velocidades
        System.out.println("Punto inicial: " + mp1);

        mp1.move(); //lo movemos una sola vez
        System.out.println("Punto inicial después de moverlo una sola vez: " + mp1);

        mp1.move().move(); //una vez movido, se vuelve a mover otra vez
        System.out.println("Punto inicial después de moverlo dos veces más: " + mp1);
    }
}
