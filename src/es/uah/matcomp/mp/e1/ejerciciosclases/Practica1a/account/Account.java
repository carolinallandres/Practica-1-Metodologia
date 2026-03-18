package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1a.account;

public class Account {
    //Atributos de la clase
    private String id;
    private String name;
    private int balance;

    //Clase por defecto con el balance de cuenta establecido en 0
    public Account (String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account (String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //Getters
    public String getId () {return id;}

    public String getName () {return name;}

    public int getBalance () {return balance;}

    //Establecer el crédito correspondiente a la cuenta
    public int credit (int amount) {return this.balance = amount+balance;}

    //Establecer el débito correspondiente a la cuenta
    public int debit (int amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    //Realiza una transferencia entre dos cuentas bancarias
    public int transferTo (Account another, int amount) {
        if (amount<=this.balance) {
            this.balance = this.balance - amount;
            another.balance = another.balance + amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public String toString () {return "Account[id="+id+",name="+name+",balance="+balance+"]";}
}
