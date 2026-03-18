package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.h;

public class Cylinder {

    private Circle base;

    private double height;


    public Cylinder() {
        this.base = new Circle();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color);
        this.height = height;
    }


    public Circle getBase() {return base;}

    public double getHeight() {return height;}

    public void setBase(Circle base) {this.base = base;}

    public void setHeight(double height) {this.height = height;}

    public double getVolume() {return base.getArea() * height;}

    public String toString() {return "Cylinder[base=" + base + ", height=" + height + "]";}
}
