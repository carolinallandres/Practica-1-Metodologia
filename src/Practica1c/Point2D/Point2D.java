package Practica1c.Point2D;

public class Point2D {
    private float x;
    private float y;

    //CONSTRUCTORES

    public Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }

    public Point2D(){
        x=0.0f;
        y=0.0f;
    }

    //GETTERS

    public float getX(){
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY(){
        return new float[]{x,y};
    }

    //SETTERS

    public void setX(float x){
        this.x=x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    //MÉTODOS

    public String toString(){
        return "("+x+","+y+")";
    }
}
