package es.uah.matcomp.mp.e1.ejerciciosclases.practica_d.e;

public class TestGeometricObject {
    public static void main(String[] args) {

        System.out.println("=== Probando Circle ===");

        // Variable de tipo interfaz, objeto de tipo Circle
        GeometricObject g1 = new Circle(5.0);
        System.out.println("Objeto g1: " + g1);
        System.out.println("Área: " + g1.getArea());
        System.out.println("Perímetro: " + g1.getPerimeter());

        System.out.println();

        // Otra instancia
        GeometricObject g2 = new Circle(10.0);
        System.out.println("Objeto g2: " + g2);
        System.out.println("Área: " + g2.getArea());
        System.out.println("Perímetro: " + g2.getPerimeter());

        System.out.println();

        // Downcasting para acceder al radio (si se desea)
        Circle c1 = (Circle) g1;
        System.out.println("Acceso directo al radio de g1: " + c1.radius);

        System.out.println();

        // Varias pruebas en un array polimórfico
        GeometricObject[] objetos = {
                new Circle(1.0),
                new Circle(2.5),
                new Circle(7.3)
        };

        System.out.println("=== Array de GeometricObject ===");
        for (GeometricObject obj : objetos) {
            System.out.println(obj + " | Área=" + obj.getArea() + " | Perímetro=" + obj.getPerimeter());
        }
    }
}
