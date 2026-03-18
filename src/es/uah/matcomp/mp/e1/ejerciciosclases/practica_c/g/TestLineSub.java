package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.g;

public class TestLineSub {

    public static void main(String[] args) {
        LineSub ls1 = new LineSub(0, 0, 3, 4);
        System.out.println(ls1);

        Point p1 = new Point(2, 2);
        Point p2 = new Point(5, 6);
        LineSub ls2 = new LineSub(p1, p2);
        System.out.println(ls2);
    }
}
