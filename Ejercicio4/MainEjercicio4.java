package Practica2.Ejercicio4;
import Practica2.GsonUtil;

public class MainEjercicio4 {
    public static void main(String[] args) {
        Estudiante[] lista = {
                new Estudiante("Carol", 20),
                new Estudiante("Isa", 22),
                new Estudiante("Alvaro", 27)
        };

        GsonUtil.guardarObjetoEnArchivo("asignatura.json",new Asignatura("Metodologia", lista));
        Asignatura asigLeer=GsonUtil.cargarObjetoDesdeArchivo("asignatura.json", Asignatura.class);

        if (asigLeer!=null) {
            System.out.println("Asignatura: "+asigLeer.getNombre());
            for (Estudiante e : asigLeer.getEstudiantes()){
                System.out.println(e);
            }
        }
        else{
            System.out.println("Error al leer el fichero");
        }
    }
}