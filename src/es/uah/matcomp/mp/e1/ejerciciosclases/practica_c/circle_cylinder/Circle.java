package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.circle_cylinder;

public class Circle {

    //Atributos
    private double radius = 1.0;
    private String color = "red";


    //Constructores
    public Circle(){} //constructor por defecto que usa los valores iniciales

    public Circle(double radius) { //constructor que permite inicializar solo el valor del radio
        this.radius=radius;
    }

    public Circle (double radius, String color) { //constructor que permite inicializar el valor del radio y el color
        this.radius=radius;
        this.color=color;
    }


    //Métodos básicos (setters y getters)
    public double getRadius() { //devuelve el radio del círculo
        return radius;
    }

    public void setRadius(double radius) { //modifica el radio del círculo
        this.radius=radius;
    }

    public String getColor() { //devuelve el color del círculo
        return color;
    }

    public void setColor(String color) { //modifica el color del círculo
        this.color=color;
    }


    //Métodos con funciones
    public double getArea() { //devuelve el área del círculo
        return Math.PI * radius * radius;
    }

    @Override
    public String toString () { //devuelve los atributos del círculo
        return "Circle[radius="+radius+", color="+color+"]";
    }
}