package Practica1c.Point;

public class TestPoint {
    public static void main(String[] args) {
        //Crear un punto normal
        Point p1 = new Point(2.0f, 3.0f);
        System.out.println(p1);

        //Crear un punto móvil con velocidades diferentes
        MovablePoint mp1=new MovablePoint(1.0f,2.0f,0.5f,1.5f);
        System.out.println(mp1);

        // Mover el punto móvil
        mp1.move();
        System.out.println(mp1);

        //Crear un punto móvil en el origen con velocidad
        MovablePoint mp2=new MovablePoint(0.0f,0.0f,2.0f,2.0f);
        System.out.println(mp2);

        //Cambiar velocidad y mover
        mp2.setSpeed(1.0f, 3.0f);
        mp2.move();
        System.out.println(mp2);
    }
}