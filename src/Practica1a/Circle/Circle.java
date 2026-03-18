package Practica1a.Circle;

public class Circle {
    private double radius;

    //Constructores

    public Circle(){
        radius=1;
    }

    public Circle(double radius){
        this.radius=radius;
    }

    //GETTERS

    public double getRadius() {
        return radius;
    }

    //SETTERS

    public void setRadius(double radius) {
        this.radius=radius;
    }

    //MÉTODOS

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getCircumference(){
        return Math.PI*2*radius;
    }

    public String toString() {
        return "Circle[radius="+radius+"]";
    }
}
