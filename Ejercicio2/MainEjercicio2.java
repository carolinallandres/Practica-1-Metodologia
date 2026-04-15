package Practica2.Ejercicio2;

import Practica1b.MyPoint.MyLine;
import Practica2.GsonUtil;

public class MainEjercicio2 {
    public static void main(String[] args) {

        MyLine linea=new MyLine(4,6,4,6);
        GsonUtil.guardarObjetoEnArchivo("linea.json",linea);
        MyLine lineaCargada=GsonUtil.cargarObjetoDesdeArchivo("linea.json", MyLine.class);
        System.out.println("Linea: "+lineaCargada);
    }
}