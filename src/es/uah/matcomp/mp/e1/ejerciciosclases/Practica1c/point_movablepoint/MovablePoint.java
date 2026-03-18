package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1c.point_movablepoint;

public class MovablePoint extends Point { //hereda de la clase punto

    //Atributos
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;


    //Constructores
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){ //inicializa el valor de la x,x llamando a la clase punto y el valor de velocidadx,velocidady
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed){  //inicializa los atributos que tiene la clase
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(){} //constructor por defecto


    //Métodos
    public float getXSpeed() { //devuelve el valor de la velocidadx
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) { //modifica el valor de la velocidadx
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() { //devuelve el valor de la velocidady
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {//modifica el valor de la velocidady
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){ //modifica el valor de la velocidadx,velocidady al mismo tiempo
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed() { //devuelve la velocidadx,velocidady en un array de dos elementos
        return new float[]{xSpeed,ySpeed};
    }

    public String toString() { //devuelve las coordenadas haciendo referencia a la clase punto (super.toString()) y los atributos
        return super.toString()+", speed=("+xSpeed+","+ySpeed+")";
    }

    public MovablePoint move(){ //obtiene las coordeanadas de la clase punto y la suma con la velocidad
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this; //devuelve el mismo objeto para poder encadenarlo y que se mueva
    }
}
