package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1d.Shape;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    //CONSTRUCTORES

    public Rectangle(){
        width=1.0;
        length=1.0;
    }

    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width, double length,String color, boolean filled){
        this.width=width;
        this.length=length;
        super(color, filled);
    }

    //GETTERS

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //SETTERS

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //MÉTODOS

    @Override
    double getArea() {
        return length*width;
    }

    @Override
    double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return"Rectangle["+super.toString()+",width="+width+",length="+length+"]";
    }
}
