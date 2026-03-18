package Practica1b.CustomerInvoice;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    //CONSTRUCTORES

    public Invoice (int id,Customer customer, double amount){
        this.id=id;
        this.customer=customer;
        this.amount=amount;
    }

    //GETTERS

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    //Getters del objeto Customer

    public int getCustomerId(){
        return customer.getId();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public double getCustomerDiscount(){
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return amount-(amount*customer.getDiscount()/100.0);
    }

    //SETTERS

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCustomer(Customer customer) {
        this.customer=customer;
    }

    //MÉTODOS

    public String toString(){
        return"Invoice[id="+id+","+customer+",amount="+amount+"]";
    }
}
