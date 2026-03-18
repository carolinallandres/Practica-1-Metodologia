package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.e;

public class Shape {

    //Atributos
    private String color = "red";
    private boolean filled = true;


    //Constructores
    public Shape() {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    //Métodos
    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public boolean isFilled() {return filled;}

    public void setFilled(boolean filled) {this.filled = filled;}

    public String toString() {return "Shape[color="+color+", filled="+filled+"]";}
}