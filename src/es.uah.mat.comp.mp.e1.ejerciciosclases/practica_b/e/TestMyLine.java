package es.uah.matcomp.mp.e1.ejerciciosclases.practica_b.e;

public class TestMyLine {
    public static void main(String[] args) {

        // Crear puntos
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // Crear línea usando puntos
        MyLine line1 = new MyLine(p1, p2);

        // Crear línea usando coordenadas
        MyLine line2 = new MyLine(0, 0, 3, 4);

        System.out.println("=== Probando MyLine ===");

        System.out.println("Línea 1: " + line1);
        System.out.println("Begin de línea 1: " + line1.getBegin());
        System.out.println("End de línea 1: " + line1.getEnd());
        System.out.println("Longitud línea 1: " + line1.getLength());

        System.out.println();

        System.out.println("Línea 2: " + line2);
        System.out.println("Begin XY: " + line2.getBeginX() + ", " + line2.getBeginY());
        System.out.println("End XY: " + line2.getEndX() + ", " + line2.getEndY());
        System.out.println("Longitud línea 2: " + line2.getLength());

        System.out.println();

        // Probando setters
        System.out.println("=== Modificando línea 2 ===");
        line2.setBeginXY(10, 10);
        line2.setEndXY(13, 14);

        System.out.println("Nueva línea 2: " + line2);
        System.out.println("Nueva longitud: " + line2.getLength());
    }
}