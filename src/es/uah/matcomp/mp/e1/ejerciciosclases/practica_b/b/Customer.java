package es.uah.matcomp.mp.e1.ejerciciosclases.practica_b.b;

public class Customer {
    private int id;
    private String name;
    private int discount;

    //CONSTRUCTORES

    public Customer (int id,String name, int discount){
        this.id=id;
        this.name=name;
        this.discount=discount;
    }

    //GETTERS

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    //SETTERS

    public void setDiscount(int discount) {
        this.discount=discount;
    }

    //MÉTODOS

    public String toString(){
        return name+"("+id+")("+discount+"%)";
    }
}
