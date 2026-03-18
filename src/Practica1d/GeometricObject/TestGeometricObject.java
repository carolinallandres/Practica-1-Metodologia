package Practica1d.GeometricObject;

public class TestGeometricObject {

    public static void main(String[] args) {
        GeometricObject uc=new Circle(5.5);
        System.out.println("s1: "+uc);                 // Circle's toString()
        System.out.println("Área: "+uc.getArea());     // Circle's getArea()
        System.out.println("Perímetro: "+uc.getPerimeter()); // Circle's getPerimeter()

        Circle dc=(Circle) uc;
        System.out.println("\nc1: "+dc);
        System.out.println("Área: "+dc.getArea());
        System.out.println("Perímetro: "+dc.getPerimeter());

        System.out.println("\n----------------\n");

        GeometricObject ur=new Rectangle(1.0,2.0);
        System.out.println("s3: "+ur);                 // Rectangle's toString()
        System.out.println("Área: "+ur.getArea());
        System.out.println("Perímetro: "+ur.getPerimeter());

        Rectangle dr=(Rectangle)ur;
        System.out.println("\nr1: "+dr);
        System.out.println("Área: "+dr.getArea());
        System.out.println("Perímetro: "+dr.getPerimeter());
    }
}
