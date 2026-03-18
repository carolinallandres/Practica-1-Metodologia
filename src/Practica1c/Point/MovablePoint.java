package Practica1c.Point;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    //CONSTRUCTORES

    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(float xSpeed,float ySpeed){
        super();
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(){
        super();
        xSpeed=0.0f;
        ySpeed=0.0f;
    }

    //GETTERS

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public float[] getSpeed(){  //Devuelve ambos valores a la vez
        return new float[]{xSpeed,ySpeed};
    }

    //SETTERS

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }



    public void setSpeed(float xSpeed,float ySpeed){   //Introduce ambos valores a la vez
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    //MÉTODOS

    @Override
    public String toString() {
        return super.toString()+",(speed="+xSpeed+","+ySpeed+")";
    }

    public MovablePoint move(){ //Añade a las coordenadas (x,y) el valor de x/ySpeed respectivamente
        setXY(getX()+xSpeed,getY()+ySpeed);
        return this;
    }
}
