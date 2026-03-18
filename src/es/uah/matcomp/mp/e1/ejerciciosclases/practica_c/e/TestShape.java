package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.e;

public class TestShape {

    public static void main(String[] args) {

        Shape s1 = new Shape("blue", false); //se declaran las distintas figuras que podemos utilizar
        Circle c1 = new Circle(2.5, "yellow", true);
        Rectangle r1 = new Rectangle(3.0, 4.0, "green", false);
        Square sq1 = new Square(5.0, "purple", true);


        System.out.println(s1); //se prueba la base


        System.out.println(c1);     // se prueba el círculo
        System.out.println("Área círculo: " + c1.getArea());
        System.out.println("Perímetro círculo: " + c1.getPerimeter());


        System.out.println(r1); // se prueba el rectángulo
        System.out.println("Área rectángulo: " + r1.getArea());
        System.out.println("Perímetro rectángulo: " + r1.getPerimeter());


        System.out.println(sq1); // se prueba el cuadrado
        System.out.println("Lado del cuadrado: " + sq1.getSide());
        System.out.println("Área cuadrado: " + sq1.getArea());
        System.out.println("Perímetro cuadrado: " + sq1.getPerimeter());
    }
}
