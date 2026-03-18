package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1c.line_subline_point;

public class Line {

    //Atributos
    private Point begin;
    private Point end;


    //Constructores
    public Line(Point begin, Point end) { //inicializa los atributos inicio y final
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) { //crea dos puntos a partir de las coordenadas beginx,beginx y endx,endy
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }


    //Métodos
    public String toString() { //devuelvo el punto de partida y el de llegada
        return "Line[begin=" + begin + ", end=" + end + "]";
    }

    public Point getBegin() { //devuelve el punto de partida
        return begin;
    }

    public Point getEnd() { //devuelve el punto de llegada
        return end;
    }

    public void setBegin(Point begin) { //modifica el valor del punto de salida
        this.begin = begin;
    }

    public void setEnd(Point end) { //modifica el valor del punto de salida
        this.end = end;
    }

    public int getBeginX() { //devuelve la coordenada x del punto de partida
        return begin.getX();
    }

    public int getBeginY() { //devuelve la coordenada y del punto de partida
        return begin.getY();
    }

    public int getEndX() { //devuelve la coordenada x del punto de llegada
        return end.getX();
    }

    public int getEndY() { //devuelve la coordenada y del punto de llegada
        return end.getY();
    }

    public void setBeginX(int x) { //modifica la coordenada x del punto de partida
        begin.setX(x);
    }

    public void setBeginY(int y) { //modifica la coordenada y del punto de partida
        begin.setY(y);
    }

    public void setBeginXY(int x, int y) { //devuelve las coordenadas x,y del punto de partida al mismo tiempo
        begin.setXY(x, y);
    }

    public void setEndX(int x) { //modifica la coordenada x del punto de llegada
        end.setX(x);
    }

    public void setEndY(int y) { //modifica la coordenada y del punto de llegada
        end.setY(y);
    }

    public void setEndXY(int x, int y) { //devuelve las coordenadas x,y del punto de llegada al mismo tiempo
        end.setXY(x, y);
    }

    public int getLength() { //devuelve la longitud de la línea utilizando la fórmula de la distancia entre dos puntos y la funcion Math.sqrt que hace una raíz cuadrada
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}