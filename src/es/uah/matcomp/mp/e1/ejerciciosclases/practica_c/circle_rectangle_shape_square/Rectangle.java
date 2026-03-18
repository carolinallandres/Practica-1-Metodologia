package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.circle_rectangle_shape_square;

public class Rectangle extends Shape{ //hereda de la clase forma

    //Atributos
    private double width = 1.0;
    private double length = 1.0;


    //Constructores
    public Rectangle() {} //constructor por defecto

    public Rectangle(double width, double length) { //llama al constructor por defecto de shape (super()) e inicializa el ancho y el largo
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) { //llama al constructor de shape para el color y filled e inicializa el ancho y el largo
        super(color, filled);
        this.width = width;
        this.length = length;
    }


    //Métodos
    public double getWidth() { //devuelve el ancho
        return width;
    }

    public void setWidth(double width) { //modifica el ancho
        this.width = width;
    }

    public double getLength() { //devuelve el largo
        return length;
    }

    public void setLength(double length) { //modifica el largo
        this.length = length;
    }

    public double getArea() { //devuelve el área con la fórmula
        return width * length;
    }

    public double getPerimeter() { //devuelve el perímetro
        return 2 * (width + length);
    }

    @Override
    public String toString() { //devuelve los atributos del círculo y utiliza super.toString() para imprimir también los de la clase forma
        return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
    }
}