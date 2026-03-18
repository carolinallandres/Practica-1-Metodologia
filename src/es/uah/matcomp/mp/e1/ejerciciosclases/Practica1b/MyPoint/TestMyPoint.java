package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1b.MyPoint;

public class TestMyPoint{
    public static void main(String[] args) {

        //Puntos

        MyPoint p1=new MyPoint(0,0);
        MyPoint p2=new MyPoint(3,4);
        MyPoint p3=new MyPoint(5,1);
        MyPoint p4=new MyPoint(1,7);

        System.out.println("--- PUNTOS ---");
        System.out.println("p1 = "+p1);
        System.out.println("p2 = "+p2);
        System.out.println("p3 = "+p3);
        System.out.println("p4 = "+p4);

        System.out.println("Distancia p1-p2 = "+p1.distance(p2));
        System.out.println("Distancia p3-p4 ="+p3.distance(p4));

        //Líneas

        MyLine line1=new MyLine(p1,p2);
        MyLine line2=new MyLine(p3,p4);

        System.out.println("\n--- LÍNEAS ---");
        System.out.println(line1);
        System.out.println("Longitud line1 = "+line1.getLength());
        System.out.println("Gradiente line1 (grados) = "+Math.toDegrees(line1.getGradient()));

        System.out.println(line2);
        System.out.println("Longitud line2 = "+line2.getLength());
        System.out.println("Gradiente line2 (grados) = "+(line2.getGradient()));

        //Círculos

        MyCircle circle1=new MyCircle(p1,5);
        MyCircle circle2=new MyCircle(3,4,3);

        System.out.println("\n--- CÍRCULOS ---");
        System.out.println(circle1);
        System.out.println("Área circle1 = "+circle1.getArea());
        System.out.println("Circunferencia circle1 = "+circle1.getCircumference());

        System.out.println(circle2);
        System.out.println("Distancia entre centros = "+circle1.distance(circle2));

        //Triángulos

        MyTriangle triangle1=new MyTriangle(p1, p2, p3);
        MyTriangle triangle2=new MyTriangle(0,0,3,0,1,2);

        System.out.println("\n--- TRIÁNGULOS ---");
        System.out.println(triangle1);
        System.out.println("Perímetro triangle1 = "+triangle1.getPerimeter());
        System.out.println("Tipo triangle1 = "+triangle1.getType());

        System.out.println(triangle2);
        System.out.println("Perímetro triangle2 = "+triangle2.getPerimeter());
        System.out.println("Tipo triangle2 = "+triangle2.getType());
    }
}