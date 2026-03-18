package es.uah.matcomp.mp.e1.ejerciciosclases.practica_b.f;

public class TestMyCircle {

    public static void main(String[] args) {

        // Crear círculos con distintos constructores
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(3, 4, 5);
        MyCircle c3 = new MyCircle(new MyPoint(10, 10), 2);

        System.out.println("=== CÍRCULOS CREADOS ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Probar getters y setters
        System.out.println("\n=== PROBANDO GETTERS Y SETTERS ===");
        System.out.println("Radio de c2: " + c2.getRadius());
        c2.setRadius(7);
        System.out.println("Nuevo radio de c2: " + c2.getRadius());

        System.out.println("Centro de c3: " + c3.getCenter());
        c3.setCenterXY(20, 30);
        System.out.println("Nuevo centro de c3: " + c3.getCenter());

        // Probar área y circunferencia
        System.out.println("\n=== ÁREA Y CIRCUNFERENCIA ===");
        System.out.println("Área de c2: " + c2.getArea());
        System.out.println("Circunferencia de c2: " + c2.getCircumference());

        // Probar distancia entre círculos
        System.out.println("\n=== DISTANCIA ENTRE CÍRCULOS ===");
        System.out.println("Distancia entre c1 y c2: " + c1.distance(c2));
        System.out.println("Distancia entre c2 y c3: " + c2.distance(c3));

        // Probar MyPoint directamente
        System.out.println("\n=== PROBANDO MyPoint ===");
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(6, 8);
        System.out.println("Distancia entre p1 y p2: " + p1.distance(p2));
    }
}