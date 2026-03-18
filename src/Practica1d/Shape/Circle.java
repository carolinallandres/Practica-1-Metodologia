package Practica1d.Shape;

public class Circle extends Shape{
    protected double radius;

    //CONSTRUCTORES

    public Circle(){
        radius=1.0;
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius,String color, boolean filled){
        this.radius=radius;
        super(color,filled);
    }

    //GETTERS

    public double getRadius() {
        return radius;
    }

    //SETTERS

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //MÉTODOS

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return "Circle["+super.toString()+",radius="+radius+"]";
    }
}
