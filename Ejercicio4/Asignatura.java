package Practica2.Ejercicio4;

public class Asignatura {
    private String nombre;
    private Estudiante[] estudiantes;

    public Asignatura(String nombre, Estudiante[] estudiantes) {
        this.nombre=nombre;
        this.estudiantes=estudiantes;
    }

    public String getNombre() { return nombre; }
    public Estudiante[] getEstudiantes() { return estudiantes; }
}