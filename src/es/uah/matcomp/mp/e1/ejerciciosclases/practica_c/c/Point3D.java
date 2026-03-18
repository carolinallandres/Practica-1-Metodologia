package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.c;

public class Point3D extends Point2D{ //hereda de la clase punto2D

    //Atributos
    private float z=0.0f;


    //Constructores
    public Point3D(float x, float y, float z) { // iniciarlizar el valor de la x,y,z
        super(x, y);
        this.z=z;
    }

    public Point3D() {} // constructor por defecto


    //Métodos
    public float getZ() { //devuelve el valor de la z
        return z;
    }

    public void setZ(float z) { //modifica el valor de la z
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) { //modifica el valor de la z y la x,y haciendo referencia al metodo de la clase punto2D
        setXY(x, y);
        this.z=z;
    }

    public float[] getXYZ() { //devuelve la x,y,z en un array de tres elementos
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString(){ //devuelve la coordenada (x,y,z)
        return "("+getX()+","+getY()+","+z+")";
    }
}