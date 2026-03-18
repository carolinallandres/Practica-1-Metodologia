package Practica1d.Shape;

public class TestShape {

    public static void main(String[] args) {
        //Upcast Circle a Shape
        Shape c1=new Circle(5.5, "red", false); // Upcast Circle -> Shape
        System.out.println("c1: "+c1);                           // Circle's toString()
        System.out.println("Área: "+c1.getArea());               // Circle's getArea()
        System.out.println("Perímetro: "+c1.getPerimeter());     // Circle's getPerimeter()
        System.out.println("Color: "+c1.getColor());
        System.out.println("Filled: "+c1.isFilled());

        //Error posible:
        //System.out.println(c1.getRadius());
        //Shape no tiene getRadius
        //ERROR de compilación

        // Downcast para acceder a métodos de Circle
        Circle c2=(Circle) c1;
        System.out.println("\nc2: "+c2);
        System.out.println("Área: "+c2.getArea());
        System.out.println("Perímetro: "+c2.getPerimeter());
        System.out.println("Color: "+c2.getColor());
        System.out.println("Filled: "+c2.isFilled());
        System.out.println("Radius: "+c2.getRadius());      //Ahora puede acceder

        System.out.println("\n----------------\n");

        //Upcast Rectangle a Shape
        Shape r1=new Rectangle(1.0,2.0,"red",false);    //Upcast Rectangle -> Shape
        System.out.println("r1: "+r1);                                          //Rectangle's toString()
        System.out.println("Área: "+r1.getArea());                              //Rectangle's getArea()
        System.out.println("Perímetro: "+r1.getPerimeter());                    //Rectangle's getPerimeter()
        System.out.println("Color: "+r1.getColor());

        //Error posible:
        //System.out.println(r1.getLength());
        //Shape no tiene getLength()
        //Error de compilación

        // Downcast para usar métodos de Rectangle
        Rectangle r2=(Rectangle)r1;
        System.out.println("\nr1: "+r2);
        System.out.println("Área: "+r2.getArea());
        System.out.println("Perímetro: "+r2.getPerimeter());
        System.out.println("Color: "+r2.getColor());
        System.out.println("Length: "+r2.getLength()); //Ahora puede acceder

        System.out.println("\n----------------\n");


        //Upcast Square a Shape
        Shape s1=new Square(6.6);             //Upcast Square -> Shape
        System.out.println("s1: "+s1);             //Square's toString()
        System.out.println("Área: "+s1.getArea()); //Square's getArea() (heredado de Rectangle)

        //Error posible:
        //System.out.println(s1.getSide());
        //Shape no tiene getSide()

        //Downcast a Rectangle (superclase de Square)
        Rectangle s2=(Rectangle) s1;
        System.out.println("\nr2: "+s2);
        System.out.println("Área: "+s2.getArea());
        //Error posible:
        //s2.getSide()
        //ERROR: Rectangle no tiene getSide()
        System.out.println("Length: "+s2.getLength());

        //Downcast a Square (subclase)
        Square sq1 = (Square) r2;
        System.out.println("\nsq1: "+sq1);
        System.out.println("Área: "+sq1.getArea());
        System.out.println("Side: "+sq1.getSide()); //Ahora sí puede acceder
        System.out.println("Length: "+sq1.getLength());
    }
}