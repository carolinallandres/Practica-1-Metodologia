package Practica1d.ResizableCircle;

public class ResizableCircle extends Circle implements Resizable{

    //MÉTODOS

    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public String toString(){
        return"ResizableCircle["+super.toString()+"]";
    }

    @Override
    public void resize(int percent) {
        radius*=percent/100.0;
    }
}
