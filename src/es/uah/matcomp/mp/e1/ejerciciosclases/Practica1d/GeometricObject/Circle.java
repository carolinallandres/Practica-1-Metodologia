package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1d.GeometricObject;

public class Circle implements GeometricObject {
    protected double radius;

    //CONSTRUCTORES

    public Circle(double radius) {
        this.radius = radius;
    }

    //MÉTODOS

    public String toString() {
        return "Circle=[radius=" + radius + "]";
    }

    @Override
    public double getArea(){    //Devuelve el área del círculo
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter(){   //Devuelve el perimetro del círculo
        return 2*Math.PI*radius;
    }
}
