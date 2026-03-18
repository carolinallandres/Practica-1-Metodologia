package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1b.MyPoint;

public class MyCircle {
    private MyPoint center;
    private int radius;

    //CONSTRUCTORES

    public MyCircle (){
        center=new MyPoint(0,0);
        radius=1;
    }

    public MyCircle(int x,int y,int radius){
        center=new MyPoint(x,y);
        this.radius=radius;
    }

    public MyCircle (MyPoint center,int radius){
        this.center=center;
        this.radius=radius;
    }

    //GETTERS

    public int getRadius() {
        return radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getCenterX(){
        return center.getX();
    }

    public int getCenterY(){
        return center.getY();
    }

    public int[] getCenterXY(){
        return center.getXY();
    }

    //SETTERS

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setCenterX(int x){
        center.setX(x);
    }

    public void setCenterY(int y){
        center.setY(y);
    }

    public void setCenterXY(int x,int y){
        center.setXY(x,y);
    }

    //MÉTODOS

    public String toString (){
        return "MyCircle[radius="+radius+","+center+"]";
    }

    public double getArea(){    //Devuelve área
        return radius*radius*Math.PI;
    }

    public double getCircumference(){   //Devuelve longuitud de circunferencia
        return 2*radius*Math.PI;
    }

    public double distance(MyCircle another){
        return center.distance(another.center);
    }
}

