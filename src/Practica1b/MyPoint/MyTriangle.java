package Practica1b.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    //CONSTRUCTORES

    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        v1=new MyPoint(x1,y1);
        v2=new MyPoint(x2,y2);
        v3=new MyPoint(x3,y3);
    }

    public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }

    public String toString(){
        return "MyTriangle[v1="+v1+",v2="+v2+",v3="+v3+"]";
    }

    public double getPerimeter(){   //Devuelve el perimetro del triangulo
        return v1.distance(v2)+ v2.distance(v3)+ v3.distance(v1);
    }

    public String getType(){    //Devuelve un string con el tipo de triangulo que es
        double d1= v1.distance(v2);
        double d2= v2.distance(v3);
        double d3= v3.distance(v1);
        String type="";
        if(d1==d2 && d2==d3){
            type="Equilateral";
        }
        else if(d1==d2 || d2==d3 || d3==d1){
            type="Isosceles";
        }
        else{
            type="Scalene";
        }
        return type;
    }
}
