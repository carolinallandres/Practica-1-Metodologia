package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.h;

public class Circle {

    //Atributos
    private double radius;
    private String color;


    //Constructores
    public Circle() { //constructor que inicializa el valor del color y el radio a unos determinados
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) { //constructor que permite inicializar el valor del radio y el valor específico del color
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) { //constructor que permite inicializar el valor del radio y el color
        this.radius = radius;
        this.color = color;
    }


    //Métodos
    public double getRadius() { //devuelve el radio
        return radius;
    }

    public String getColor() { //devuelve el color
        return color;
    }

    public void setRadius(double radius) { //modifica el radio
        this.radius = radius;
    }

    public void setColor(String color) { //modifica el color
        this.color = color;
    }

    public double getArea() { //devuelve el área del círculo
        return Math.PI * radius * radius;
    }

    public String toString() { //devuelve los atributos del círculo
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}