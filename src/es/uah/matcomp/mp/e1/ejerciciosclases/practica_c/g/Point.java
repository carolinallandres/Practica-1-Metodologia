package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.g;

public class Point {

    //Atributos
    private int x;
    private int y;


    //Constructores
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //Métodos
    public String toString() {return "Point: (" + x + "," + y + ")";}

    public int getX() { return x; }

    public int getY() { return y; }

    public void setX(int x) { this.x = x; }

    public void setY(int y) { this.y = y; }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
