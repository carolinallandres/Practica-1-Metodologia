package Practica1c.Shape;

public class Shape {
    private String color;
    private boolean filled;

    //CONSTRUCTORES

    public Shape(){
        color="red";
        filled=true;
    }

    public Shape (String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    //GETTERS

    public String getColor() {
        return color;
    }

    public boolean isFilled(){  //Devuelve si está relleno
        return filled;
    }

    //SETTERS

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //MÉTODOS

    @Override
    public String toString() {
        return "Shape[color="+color+",filled="+filled+"]";
    }
}
