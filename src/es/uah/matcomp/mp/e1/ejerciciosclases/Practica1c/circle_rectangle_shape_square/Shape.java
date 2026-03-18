package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1c.circle_rectangle_shape_square;

public class Shape {

    //Atributos
    private String color = "red";
    private boolean filled = true;


    //Constructores
    public Shape() {} //constructor por defecto

    public Shape(String color, boolean filled) { //inicializa sus atributos
        this.color = color;
        this.filled = filled;
    }


    //Métodos
    public String getColor() { //devuelve el color
        return color;
    }

    public void setColor(String color) { //modifica el color
        this.color = color;
    }

    public boolean isFilled() { //devuelve si está completo
        return filled;
    }

    public void setFilled(boolean filled) { //modifica si está completo
        this.filled = filled;
    }

    public String toString() { //devuelve los atributos
        return "Shape[color="+color+", filled="+filled+"]";
    }
}