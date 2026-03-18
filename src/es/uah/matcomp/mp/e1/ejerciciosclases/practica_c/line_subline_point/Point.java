package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.line_subline_point;

public class Point {

    //Atributos
    private int x;
    private int y;


    //Constructores
    public Point(int x, int y) { //inicializa los atributos de la clase
        this.x = x;
        this.y = y;
    }


    //Métodos
    public String toString() { //devuelve las coordenadas (x,y) del punto
        return "Point: (" + x + "," + y + ")";
    }

    public int getX() { //devuelve la coordenada x
        return x;
    }

    public int getY() { //devuelve la coordenada y
        return y;
    }

    public void setX(int x) { //modifica la coordenada x
        this.x = x;
    }

    public void setY(int y) { //modifica la coordenada y
        this.y = y;
    }

    public void setXY(int x, int y) { //modifica la coordenada x,y al mismo tiempo
        this.x = x;
        this.y = y;
    }
}