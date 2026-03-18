package Practica1c.Person;

public class Staff extends Person {
    private String school;
    private double pay;

    //CONSTRUCTORES

    public Staff (String name,String address, String school,double pay){
        super(name, address);
        this.school=school;
        this.pay=pay;
    }

    //GETTERS

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    //SETTERS

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    //MÉTODOS

    @Override
    public String toString(){
        return "Staff["+super.toString()+",school="+school+",pay="+pay+"]";
    }
}
