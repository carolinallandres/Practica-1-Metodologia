package Practica1c.Shape;

public class TestShape {
    public static void main(String[] args) {
        // Crear un círculo
        Circle c1=new Circle(5.0,"azul",true);
        System.out.println(c1);
        System.out.println("Área: "+c1.getArea());
        System.out.println("Perímetro: "+c1.getPerimeter());

        // Crear un rectángulo
        Rectangle r1=new Rectangle(3.0,4.0,"verde", false);
        System.out.println(r1);
        System.out.println("Área: "+r1.getArea());
        System.out.println("Perímetro: "+r1.getPerimeter());

        // Crear un cuadrado
        Square s1=new Square(6.0,"amarillo",true);
        System.out.println(s1);
        System.out.println("Área: "+s1.getArea());
        System.out.println("Perímetro: "+s1.getPerimeter());

        // Polimorfismo: referencia Shape a diferentes objetos
        Shape sh1=c1;
        Shape sh2=r1;
        Shape sh3=s1;

        System.out.println("\n--- Polimorfismo con Shape ---");
        System.out.println(sh1);
        System.out.println(sh2);
        System.out.println(sh3);

        // Cambiar atributos usando setters
        s1.setSide(8.0);
        c1.setRadius(7.0);
        r1.setWidth(5.0);
        r1.setLength(6.0);

        System.out.println("\n--- Después de modificar dimensiones ---");
        System.out.println(c1);
        System.out.println(r1);
        System.out.println(s1);
    }
}