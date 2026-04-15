package Practica2.Ejercicio1;

import Practica1a.Circle.Circle;
import Practica1a.Rectangle.Rectangle;
import Practica1b.MyPoint.MyLine;
import Practica1b.MyPoint.MyTriangle;
import Practica1c.Point2D.Point2D;
import Practica1c.Point2D.Point3D;
import Practica1d.Movable.MovableCircle;
import Practica1d.Movable.MovablePoint;
import Practica2.GsonUtil;

public class MainEjercicio1 {

    public static void main(String[] args) {

        //CIRCLE
        Circle circle=new Circle(5);
        GsonUtil.guardarObjetoEnArchivo("circle.json", circle);
        GsonUtil.imprimirToStringDesdeArchivo("circle.json", Circle.class);;

        //RECTANGLE
        Rectangle rect=new Rectangle(4,6);
        GsonUtil.guardarObjetoEnArchivo("rectangle.json", rect);
        GsonUtil.imprimirToStringDesdeArchivo("rectangle.json", Rectangle.class);

        //MYLINE
        MyLine linea=new MyLine(1,2,4,6);
        GsonUtil.guardarObjetoEnArchivo("linea.json", linea);
        GsonUtil.imprimirToStringDesdeArchivo("linea.json", MyLine.class);

        //MYTRIANGLE
        MyTriangle tri=new MyTriangle(0,0,3,0,0,4);
        GsonUtil.guardarObjetoEnArchivo("triangulo.json", tri);
        GsonUtil.imprimirToStringDesdeArchivo("triangulo.json", MyTriangle.class);

        //POINT2D
        Point2D p2=new Point2D(2,3);
        GsonUtil.guardarObjetoEnArchivo("point2D.json", p2);
        GsonUtil.imprimirToStringDesdeArchivo("point2D.json", Point2D.class);


        //POINT3D
        Point3D p3=new Point3D(1,2,3);
        GsonUtil.guardarObjetoEnArchivo("point3D.json", p3);
        GsonUtil.imprimirToStringDesdeArchivo("point3D.json", Point3D.class);

        //MOVABLE POINT
        MovablePoint mp=new MovablePoint(1,1,2, 2);
        GsonUtil.guardarObjetoEnArchivo("movablePoint.json", mp);
        GsonUtil.imprimirToStringDesdeArchivo("movablePoint.json", MovablePoint.class);

        //MOVABLE CIRCLE
        MovableCircle mc=new MovableCircle(5,5,1,1,10);
        GsonUtil.guardarObjetoEnArchivo("movableCircle.json", mc);
        GsonUtil.imprimirToStringDesdeArchivo("movableCircle.json", MovableCircle.class);

        System.out.println("\nTodos los objetos guardados y cargados correctamente.");
    }
}