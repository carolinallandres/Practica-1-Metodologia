package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.person_staff_student;

public class Student extends Person { //hereda de la clase persona

    //Atributos
    private String program;
    private int year;
    private double fee;


    //Constructores
    public Student(String name, String address, String program, int year, double fee) { //llama al constructor por defecto de la persona para el nombre y la dirección e inicializa el programa, la tarifa y el año
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }


    //Métodos básicos (getters y setters)
    public String getProgram() { //devuelve el programa
        return program;
    }

    public void setProgram(String program) { //modifica el valor del programa
        this.program=program;
    }

    public int getYear() { //devuelve el año
        return year;
    }

    public void setYear(int year) { //modifica el valor del año
        this.year=year;
    }

    public double getFee() { //devuelve la tarifa
        return fee;
    }

    public void setFee(double fee) { //modifica el valor de la tarifa
        this.fee=fee;
    }


    //Métodos con función
    @Override
    public String toString() { //devuelve los atributos del estudiante, incluyendo los de la clase persona (super.toString())
        return "Student["+super.toString()+", program="+program+", year="+year+", fee="+fee+"]";
    }
}