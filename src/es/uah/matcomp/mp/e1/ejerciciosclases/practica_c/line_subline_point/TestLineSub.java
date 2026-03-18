package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.line_subline_point;

public class TestLineSub {

    public static void main(String[] args) {

        LineSub ls1 = new LineSub(0, 0, 3, 4); //se declara una linea con todas sus coordenadas
        System.out.println(ls1);

        Point p1 = new Point(2, 2); //se crean dos puntos, uno para el principio y otro para el final
        Point p2 = new Point(5, 6);
        LineSub ls2 = new LineSub(p1, p2); //se crea la línea que contiene el punto inicial y el punto final
        System.out.println(ls2);
    }
}
