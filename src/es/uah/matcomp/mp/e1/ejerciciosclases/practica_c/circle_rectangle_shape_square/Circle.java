package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.circle_rectangle_shape_square;

public class Circle extends Shape { //hereda de la clase forma

    //Atributos
    private double radius = 1.0;


    //Constructores
    public Circle() {} //contructor por defecto

    public Circle(double radius) { //llama al constructor por defecto de shape (super()) e inicializa el radio
        super();
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled) { //llama al constructor de shape para el color y filled e inicializa la altura
        super(color, filled);
        this.radius = radius;
    }


    //Métodos
    public double getRadius() { //devuelve el radio
        return radius;
    }

    public void setRadius(double radius) { //modifica el radio
        this.radius = radius;
    }

    public double getArea() { //devuelve el área usando Math.PI que proporciona el valor del número Pi
        return Math.PI*radius*radius;
    }

    public double getPerimeter() { //devuelve la longitud
        return Math.PI*radius*radius;
    }

    public String toString() { //devuelve los atributos del círculo y utiliza super.toString() para imprimir también los de la clase forma
        return "Circle"+super.toString()+"radius="+radius+"]";
    }
}