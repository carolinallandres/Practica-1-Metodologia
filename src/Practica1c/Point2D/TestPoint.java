package Practica1c.Point2D;

public class TestPoint {
    public static void main(String[] args) {
        //Crear un punto 2D
        Point2D p2d=new Point2D(3.0f,4.0f);
        System.out.println(p2d);

        //Cambiar coordenadas
        p2d.setX(5.0f);
        p2d.setY(6.0f);
        System.out.println(p2d);

        //Crear un punto 3D
        Point3D p3d=new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(p3d);

        //Cambiar coordenadas
        p3d.setXYZ(4.0f,5.0f,6.0f);
        System.out.println(p3d);

        //Usar getters
        float[]coords2D=p2d.getXY();
        System.out.println("Coordenadas 2D: ("+coords2D[0]+","+coords2D[1]+")");

        float[]coords3D=p3d.getXYZ();
        System.out.println("Coordenadas 3D: ("+coords3D[0]+","+coords3D[1]+","+coords3D[2]+")");
    }
}