package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1c.point_movablepoint;

public class Point {

    //Atributos
    private float x=0.0f;
    private float y=0.0f;


    //Constructores
    public Point(float x, float y) { //inicializa los atributos x,y
        this.x = x;
        this.y = y;
    }

    public Point() {} //constructor por defecto


    //Métodos
    public float getX() {
        return x;
    } //devuelve el valor de la x

    public void setX(float x) {
        this.x = x;
    } //modifica el valor de la x

    public float getY() {
        return y;
    } //devuelve el valor de la y

    public void setY(float y) {
        this.y = y;
    } //modifica el valor de la y

    public void setXY (float x, float y) { //modifica el valor de la x,y al mismo tiempo
        this.x = x;
        this.y = y;
    }

    public float[] getXY() { //devuelve el valor de la x,y en un array de dos elementos
        return new float[]{x, y};
    }

    @Override
    public String toString(){ //devuelve las coordenadas (x,y)
        return "(" + x + ", " + y + ")";
    }
}