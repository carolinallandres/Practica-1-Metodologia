package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1d.Movable;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    //CONSTRUCTORES

    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius){
        this.radius=radius;
        center=new MovablePoint(x,y,xSpeed,ySpeed);
    }

    //MÉTODOS

    public String toString(){
        return center.toString()+",radius="+radius;
    }

    //Usa los métodos de MovablePoint para mover el centro del círculo
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}

