package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1d.Movable;

public class TestMovable {

    public static void main(String[] args) {

        //Punto movible
        MovablePoint p=new MovablePoint(0,0,2,3);
        System.out.println("Punto inicial: "+p);
        p.moveUp();
        p.moveRight();
        System.out.println("Punto después de mover: "+p);

        //Círculo movible
        MovableCircle c=new MovableCircle(5,5,1,1, 10);
        System.out.println("\nCírculo inicial: "+c);
        c.moveLeft();
        c.moveDown();
        System.out.println("Círculo después de mover: "+c);
    }
}