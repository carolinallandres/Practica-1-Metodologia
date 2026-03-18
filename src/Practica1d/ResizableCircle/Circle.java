package Practica1d.ResizableCircle;

public class Circle implements GeometricObject {
    protected double radius;

    //CONSTRUCTOR

    public Circle(double radius){
        this.radius=radius;
    }

    //MÉTODOS

    @Override
    public String toString(){
        return"Circle[radius="+radius+"]";
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}

