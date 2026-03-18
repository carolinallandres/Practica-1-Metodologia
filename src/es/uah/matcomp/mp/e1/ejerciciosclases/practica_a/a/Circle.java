package es.uah.matcomp.mp.e1.ejerciciosclases.practica_a.a;

public class Circle {

    //Atributos
    private double radius;
    private String color;

    //Constructores
    //Constructor por defecto de la clase
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    //Constructor usando el valor del radio dado y color por defecto
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    //Métodos
    //Devuelve el radio
    public double getRadius() {
        return radius;
    }
    
    //Asigna un valor a la variable radio
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //Cálculo del área del círculo
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
    
    //Cálculo de la circunferencia del círculo
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

