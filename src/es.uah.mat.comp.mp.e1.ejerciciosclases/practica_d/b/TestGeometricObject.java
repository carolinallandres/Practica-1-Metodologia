package es.uah.matcomp.mp.e1.ejerciciosclases.practica_d.b;

public class TestGeometricObject {
    public static void main(String[] args) {

        // --- Usando la interfaz como tipo de referencia ---
        GeometricObject g1 = new Circle(5.5);
        GeometricObject g2 = new Rectangle(2.0, 3.0);

        // --- Probando Circle ---
        System.out.println(g1);                 // Circle.toString()
        System.out.println("Area: " + g1.getArea());
        System.out.println("Perimeter: " + g1.getPerimeter());

        // --- Probando Rectangle ---
        System.out.println(g2);                 // Rectangle.toString()
        System.out.println("Area: " + g2.getArea());
        System.out.println("Perimeter: " + g2.getPerimeter());

        // --- Downcasting opcional (si quieres acceder a métodos propios) ---
        Circle c1 = (Circle) g1;
        System.out.println("Radio del círculo: " + c1.toString());

        Rectangle r1 = (Rectangle) g2;
        System.out.println("Dimensiones del rectángulo: " + r1.toString());
    }
}
