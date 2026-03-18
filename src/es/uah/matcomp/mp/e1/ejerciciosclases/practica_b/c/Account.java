package es.uah.matcomp.mp.e1.ejerciciosclases.practica_b.c;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    //CONSTRUCTORES

    public Account(int id, Customer customer,double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }

    public Account(int id, Customer customer){
        this.id=id;
        this.customer=customer;
        this.balance=0.0;
    }

    //GETTERS

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    //SETTERS

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //MÉTODOS

    public String toString(){
        balance=balance%.2f;
        return customer+" balance=$"+balance;
    }

    public Account deposit(double amount){  //Suma la cantidad amount al balance de la cuenta
        balance+=amount;
        return this;
    }

    public Account withdraw(double amount){ //Resta, si hay suficiente dinero, amount del balance
        if(balance>=amount){
            balance-=amount;
        }
        else{   //Si no hay suficiente dinero muestra mensaje
            System.out.println("amount withdrawn exceeds the curent balance!");
        }
        return this;
    }
}
