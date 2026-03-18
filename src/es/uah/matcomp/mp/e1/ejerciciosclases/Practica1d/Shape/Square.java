package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1d.Shape;

public class Square extends Rectangle{

    //CONSTRUCTORES

    public Square() {
    }

    public Square(double side){
        super(side,side);
    }

    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }

    //GETTERS

    public double getSide(){
        return getLength();
    }

    //SETTERS

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    //MÉTODOS

    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return"Square["+super.toString()+"]";
    }
}
