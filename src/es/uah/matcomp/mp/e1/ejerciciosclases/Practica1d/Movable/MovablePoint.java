package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1d.Movable;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    //CONSTRUCTORES

    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    //MÉTODOS

    public String toString() {
        return"("+x+","+y+") speed=("+xSpeed+","+ySpeed+")";
    }


    //Los siguiente métodos modifican los respectivos puntos una cantidad definida en x/ySpeed
    @Override
    public void moveUp() {
        y-=ySpeed;
    }

    @Override
    public void moveDown() {
        y+=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }
}
