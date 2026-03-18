package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.c;

public class TestPoint2D {

    public static void main(String[] args) {

        System.out.println("Probador de la clase Point2D");

        Point2D p2 = new Point2D(3.0f, 4.0f); //se declara un punto con dos coordenadas
        System.out.println("Punto2 = " + p2);

        p2.setXY(10.5f, 5.5f); //se modifican las coordenadas para ver si se actualizan
        System.out.println("Nuevos valores punto2 = " + p2);

        float[] xy = p2.getXY();
        System.out.println("getXY(): x = " + xy[0] + ", y = " + xy[1]); //se prueba si la clase devuelve bien el array con las coordenadas


        System.out.println("Probador de la clase Point3D");

        Point3D p3 = new Point3D(1.0f, 2.0f, 3.0f); //se declara un punto con tres coordenadas
        System.out.println("Punto3 = " + p3);

        p3.setXYZ(2.5f, 2.0f, 99.99f); //se modifican las coordenadas para ver si se actualizan
        System.out.println("Nuevos valores punto3 = " + p3);

        float[] xyz = p3.getXYZ();
        System.out.println("getXYZ(): x = " + xyz[0] + ", y = " + xyz[1] + ", z = " + xyz[2]); //se prueba si la clase devuelve bien el array con las coordenadas
    }
}