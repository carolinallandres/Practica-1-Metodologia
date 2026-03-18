package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1a.h;

public class Ball {
    //Atributos de la clase
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    //Getters y Setters 
    public float getX() {return this.x;}

    public void setX(float x) {this.x = x;}

    public float getY() {return this.y;}

    public void setY(float y) {this.y = y;}

    public int getRadius() {return this.radius;}

    public void setRadius(int radius) {this.radius = radius;}

    public float getXDelta() {return this.xDelta;}

    public void setXDelta(float xDelta) {this.xDelta = xDelta;}

    public float getYDelta() {return this.yDelta;}

    public void setYDelta(float yDelta) {this.yDelta = yDelta;}
    
    //Mover la pelota
    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    //Métodos para cambiar el sentido de los deltas correspondientes
    public void reflectHorizontal() {this.xDelta = -this.xDelta;}

    public void reflectVertical() {this.yDelta = -this.yDelta;}

    public String toString() {
        return "Ball[("+this.x+","+this.y+"),speed=("+this.xDelta+","+this.yDelta+")]";}
}

