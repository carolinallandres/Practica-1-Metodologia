package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.h;

public class Circle {

    //Atributos
    private double radius;
    private String color;


    //Constructores
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    //Métodos
    public double getRadius() {return radius;}

    public String getColor() {return color;}

    public void setRadius(double radius) {this.radius = radius;}

    public void setColor(String color) {this.color = color;}

    public double getArea() {return Math.PI * radius * radius;}

    public String toString() {return "Circle[radius=" + radius + ", color=" + color + "]";}
}
