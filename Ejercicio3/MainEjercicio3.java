package Practica2.Ejercicio3;

import Practica1a.Circle.Circle;
import Practica2.GsonUtil;


public class MainEjercicio3 {
    public static void main(String[] args) {
        Circle[] lista={new Circle(1),new Circle(2),new Circle(3)};
        GsonUtil.guardarArray("circulos.json",lista);
        Circle[] lista2=GsonUtil.cargarArray("circulos.json", Circle[].class);
        for (Circle c : lista2) {
            System.out.println(c);
        }
    }
}