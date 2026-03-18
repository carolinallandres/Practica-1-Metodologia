package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.circle_cylinder;

public class Cylinder extends Circle { //hereda de la clase círculo

    //Atributos
    private double height;


    //Constructores
    public Cylinder() { //llama al constructor por defecto de circle (super()) y establece el valor de la altura
        super();
        height = 1.0;
    }

    public Cylinder(double height) { //llama al constructor por defecto de circle (super()) e inicializa la altura
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) { //llama al constructor por defecto de circle para el radio e inicializa la altura
        super(radius);
        this.height = height;
    }


    //Métodos básicos (setters y getters)
    public double getHeight() { //devuelve la altura
        return height;
    }


    //Métodos con funciones
    public double getVolume() { //devuelve el volumen del cilindro, utilizando para calcular el área el metodo declarado en el círculo
        return getArea()*height;
    }
}