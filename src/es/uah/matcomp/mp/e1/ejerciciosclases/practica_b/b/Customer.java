package es.uah.matcomp.mp.e1.ejerciciosclases.practica_b.b;

public class Customer {
    private int id;
    private String name;
    private char gender;// EN CASO DE CARACTER INVALIDO gender='m'

    //CONSTRUCTORES

    public Customer (int id, String name, char gender){
        this.id=id;
        this.name=name;
        if(gender!='m' && gender!='f'){
           this.gender='m';
        }
        else{
            this.gender=gender;
        }
    }

    //GETTERS

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    //MÉTODOS

    public String toString(){
        return name+"("+id+")";
    }
}
