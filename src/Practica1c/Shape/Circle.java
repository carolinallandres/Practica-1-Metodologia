package Practica1c.Shape;

public class Circle extends Shape{
    private double radius;

    //CONSTRUCTORES

    public Circle(){
        super();
        radius=1.0;
    }

    public  Circle(double radius){
        super();
        this.radius=radius;
    }

    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius=radius;
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

    public double getArea(){    //Devuelve área
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){   //Devuelve perímetro
        return 2*Math.PI*radius;
    }

    @Override
    public String toString(){
        return "Circle["+super.toString()+",radius="+radius+"]";
    }
}
