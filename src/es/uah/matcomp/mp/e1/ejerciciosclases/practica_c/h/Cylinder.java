package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.h;

public class Cylinder {

    //Atributos
    private Circle base;
    private double height;


    //Constructores
    public Cylinder() { //inicializa la base del cilindro por defecto y la altura determinada
        this.base = new Circle();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) { //inicializa la base del circulo con el radio dado y la altura
        this.base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) { //inicializa la base del circulo con el radio y el color dados y la altura
        this.base = new Circle(radius, color);
        this.height = height;
    }


    //Métodos
    public Circle getBase() { //devuelve la base
        return base;
    }

    public double getHeight() { //devuelve la altura
        return height;
    }

    public void setBase(Circle base) { //modifica la base
        this.base = base;
    }

    public void setHeight(double height) { //modifica la altura
        this.height = height;
    }

    public double getVolume() { //devuelve el volumen utilizando la fórmula y obteniendo el radio de la base como hemos programado anteriormente
        double radius = base.getRadius();
        return Math.PI * radius * radius * height;
    }

    public String toString() { //devuelve los atributos del cilindro
        return "Cylinder[base=" + base + ", height=" + height + "]";
    }
}
