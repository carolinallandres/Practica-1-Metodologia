package Practica2.Practica2b.Ejemplo;


import Practica2.GsonUtil;

public class Main{
    public static void main(String[] args) {

        String rutaArchivo="usuario.json";

        Usuario usuarioCargado= GsonUtil.cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);

        if (usuarioCargado!=null) {
            System.out.println("Nombre: "+usuarioCargado.getNombre());
            System.out.println("Edad: "+usuarioCargado.getEdad());
            System.out.println("Correo: "+usuarioCargado.getCorreo());
        } else {
            System.out.println("No se pudo cargar el usuario");
        }
    }
}