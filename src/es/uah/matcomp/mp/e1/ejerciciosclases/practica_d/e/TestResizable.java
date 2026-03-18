package es.uah.matcomp.mp.e1.ejerciciosclases.practica_d.e;

public class TestResizable {
    public static void main(String[] args) {

        System.out.println("=== Probando ResizableCircle ===");

        // Variable de tipo interfaz, objeto de tipo ResizableCircle
        Resizable r1 = new ResizableCircle(10.0);
        System.out.println("Inicial: " + r1);

        // Reducir al 50%
        r1.resize(50);
        System.out.println("Después de resize(50): " + r1);

        // Aumentar al 200%
        r1.resize(200);
        System.out.println("Después de resize(200): " + r1);

        System.out.println();

        // Polimorfismo doble: ResizableCircle es también un Circle
        GeometricObject g1 = (GeometricObject) r1;
        System.out.println("Como GeometricObject:");
        System.out.println("Área: " + g1.getArea());
        System.out.println("Perímetro: " + g1.getPerimeter());

        System.out.println();

        // Downcasting para acceder al radio directamente
        ResizableCircle rc = (ResizableCircle) r1;
        System.out.println("Acceso directo al radio: " + rc.toString());
    }
}
