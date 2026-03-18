package Practica1a.Rectangle;

import org.w3c.dom.css.Rect;

public class Rectangle {
    private float length;
    private float width;

    //Constructores

    public Rectangle(){
        length=1.0f;
        width=1.0f;
    }

    public Rectangle(float length,float width){
        this.length=length;
        this.width=width;
    }

    //GETTERS


    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    //SETTERS


    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    //MÉTODOS

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    public String toString(){
        return "Rectangle[length="+length+",width="+width+"]";
    }
}
