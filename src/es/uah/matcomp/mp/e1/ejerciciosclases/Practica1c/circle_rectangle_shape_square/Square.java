package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1c.circle_rectangle_shape_square;

public class Square extends Rectangle { //hereda de rectángulo

    //Constructores
    public Square() {} //constructor por defecto

    public Square(double side) { //para inicializar el lado del cuadrado toma un lado del rectángulo (super()) usando el mismo valor para ancho y largo
        super(side, side);
    }

    public Square(double side, String color, boolean filled) { //llama al constructor de la clase rectángulo (super()) para inicializar todos sus atributos
        super(side, side, color, filled);
    }


    //Métodos
    public double getSide() { //para devolver el tamaño, toma el valor del ancho de la clase rectángulo
        return getWidth();
    }

    public void setSide(double side) { //permite modificar el lado del cuadrado habiendo establecido que el ancho y el largo del rectángulo deben ser iguales
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) { //con esto obliga a que si se modifica el ancho también se modifica el largo
        setSide(side);
    }

    @Override
    public void setLength(double side) { //con esto obliga a que si se modifica el ancho también se modifica el largo
        setSide(side);
    }

    @Override
    public String toString() { //devuelve los lados del cuadrado usando el largo y el ancho del rectángulo que están configurados para que sean iguales
        return "Square[" + super.toString() + "]";
    }
}