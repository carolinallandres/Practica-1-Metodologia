package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1d.GeometricObject;

public class Rectangle implements GeometricObject{
    protected double width;
    protected double length;

    //CONSTRUCTORES

    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    //MÉTODOS

    public String toString(){
        return "Rectangle[width="+width+",length="+length+"]";
    }

    @Override
    public double getArea(){    //Devuelve el área del rectangulo
        return width*length;
    }

    @Override
    public double getPerimeter(){   //Devuelve el perímetro del rectángulo
        return 2*width+2*length;
    }
}
