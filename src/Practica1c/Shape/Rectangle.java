package Practica1c.Shape;

public class Rectangle extends Shape{
    private double width;
    private double length;

    //CONSTRUCTORES

    public Rectangle (){
        super();
        width=1.0;
        length=1.0;
    }

    public Rectangle(double width,double length){
        super();
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    //GETTERS

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //SETTERS

    public void setWidth(double width) {
        this.width = width;
    }


    public void setLength(double length) {
        this.length = length;
    }

    //MÉTODOS

    public double getArea(){    //Devuelve área
        return width*length;
    }

    public double getPerimeter(){   //Devuelve perímetro
        return 2*width+2*length;
    }

    @Override
    public String toString(){
        return "Rectangle["+super.toString()+",width="+width+",length="+length+"]";
    }
}
