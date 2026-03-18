package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1d.ResizableCircle;

public class TestResizableCircle {

    public static void main(String[] args) {

        // Crear un círculo escalable
        ResizableCircle rc=new ResizableCircle(10.0);
        System.out.println(rc);
        System.out.println("Área: "+rc.getArea());
        System.out.println("Perímetro: "+rc.getPerimeter());
        //Aumentando un 50%
        rc.resize(50);
        //Después del cambio
        System.out.println("\nDespués de resize(50):");
        System.out.println(rc);
        System.out.println("Área: "+rc.getArea());
        System.out.println("Perímetro: "+rc.getPerimeter());
    }
}