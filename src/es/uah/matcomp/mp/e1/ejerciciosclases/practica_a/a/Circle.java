package es.uah.matcomp.mp.e1.ejerciciosclases.practica_a.a;

public class Circle {

    //Atributos
    private double radius = 1.0;


    //Constructores
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    //Métodos
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

