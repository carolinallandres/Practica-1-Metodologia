package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.c;

public class TestPoint2D {

    public static void main(String[] args) {

        System.out.println("=== Probando Point2D ===");
        Point2D p2 = new Point2D(3.0f, 4.0f);
        System.out.println("p2 = " + p2);

        p2.setXY(10.5f, 20.5f);
        System.out.println("Nuevos valores p2 = " + p2);

        float[] xy = p2.getXY();
        System.out.println("getXY(): x = " + xy[0] + ", y = " + xy[1]);


        System.out.println("\n=== Probando Point3D ===");
        Point3D p3 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("p3 = " + p3);

        p3.setXYZ(7.7f, 8.8f, 9.9f);
        System.out.println("Nuevos valores p3 = " + p3);

        float[] xyz = p3.getXYZ();
        System.out.println("getXYZ(): x = " + xyz[0] + ", y = " + xyz[1] + ", z = " + xyz[2]);
    }
}
