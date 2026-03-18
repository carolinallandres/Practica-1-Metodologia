package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1c.line_subline_point;

public class LineSub extends Point { //hereda de punto

    //Atributos
    private Point end;


    //Constructores
    public LineSub(int beginX, int beginY, int endX, int endY) { //inicializa el punto inicial usando el constructor de la clase punto (super()) y declara un punto final como nuevo objeto
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) { //inicializa el punto inicial usando el constructor de la clase punto (super()) e inicializa el punto final como él mismo
        super(begin.getX(), begin.getY());
        this.end = end;
    }


    //Métodos
    public String toString() { //devuelve las coordenadas del punto
        return "LineSub[begin=(" + getX() + "," + getY() + "), end=" + end + "]";
    }

    public Point getBegin() { //devuelve el punto inicial que se crea como un objeto nuevo
        return new Point(getX(), getY());
    }

    public Point getEnd() { //devuelve el punto final
        return end;
    }

    public void setBegin(int x, int y) { //modifica el punto inicial utilizando el metodo de la clase punto
        setXY(x, y);
    }

    public void setEnd(Point end) { //modifica el punto final
        this.end = end;
    }

    public int getBeginX() { //modifica la coordenada x del punto de partida utilizando el metodo de la clase punto
        return getX();
    }

    public int getBeginY() { //modifica la coordenada y del punto de partida utilizando el metodo de la clase punto
        return getY();
    }

    public int getEndX() { //modifica la coordenada x del punto de llegada
        return end.getX();
    }

    public int getEndY() { //modifica la coordenada y del punto de llegada
        return end.getY();
    }

    public void setBeginX(int x) { //modifica la coordenada x del punto de partida utilizando el metodo de la clase punto
        setX(x);
    }

    public void setBeginY(int y) { //modifica la coordenada y del punto de partida utilizando el metodo de la clase punto
        setY(y);
    }

    public void setBeginXY(int x, int y) { //modifica las coordenadas x,y del punto de partida al mismo tiempo utilizando el metodo de la clase punto
        setXY(x, y);
    }

    public void setEndX(int x) { //modifica la coordenada y del punto de llegada
        end.setX(x);
    }

    public void setEndY(int y) { //modifica la coordenada y del punto de llegada
        end.setY(y);
    }

    public void setEndXY(int x, int y) { //modifica las coordenadas x,y del punto de partida al mismo tiempo
        end.setXY(x, y);
    }

    public int getLength() { //devuelve la longitud de la línea utilizando la fórmula de la distancia entre dos puntos y la funcion Math.sqrt que hace una raíz cuadrada
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return (int)Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}