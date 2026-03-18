package Practica1c.Point2D;

public class Point3D extends Point2D{
    private float z;

    //CONSTRUCTORES

    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }

    public Point3D(){
        super();
        z=0.0f;
    }

    //GETTERS

    public float getZ() {
        return z;
    }

    public float[] getXYZ(){
        return new float[]{getX(),getY(),z};
    }

    //SETTERS

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        setXY(x,y);
        this.z=z;
    }

    //MÉTODOS

    @Override
    public String toString(){
        return "("+getX()+","+getY()+","+z+")";
    }
}