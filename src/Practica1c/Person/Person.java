package Practica1c.Person;

public class Person {
    private String name;
    private String address;

    //CONSTRUCTORES

    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }

    //GETTERS

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    //SETTERS

    public void setAddress(String address) {
        this.address = address;
    }

    //MÉTODOS

    public String toString(){
        return "Person[name="+name+",address="+address+"]";
    }
}
