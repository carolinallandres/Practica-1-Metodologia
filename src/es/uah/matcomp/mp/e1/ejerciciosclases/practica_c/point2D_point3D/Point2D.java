package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.point2D_point3D;

public class Point2D {

    //Atributos
    private float x=0.0f;
    private float y=0.0f;


    //Constructores
    public Point2D(float x, float y) { // iniciarliza el valor de la x,y
        this.x = x;
        this.y = y;
    }

    public Point2D() {} // constructor por defecto


    //Métodos
    public float getX() { //devuelve el valor de la x
        return x;
    }

    public void setX(float x) { //modifica el valor de la x
        this.x = x;
    }

    public float getY() { //devuelve el valor de la y
        return y;
    }

    public void setY(float y) { //modifica el valor de la y
        this.y = y;
    }


    public void setXY (float x, float y) { //modifica el valor de la x,y a la vez
        this.x = x;
        this.y = y;
    }

    public float[] getXY() { //devuelve la x,y en un array de dos elementos
        return new float[]{x, y};
    }

    @Override
    public String toString(){ //devuelve la coordenada (x,y)
        return "(" + x + ", " + y + ")";
    }
}