package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1b.CustomerAccount;

public class TestCustomerAccount {
    public static void main(String[] args) {

        //Crear clientes
        Customer c1 = new Customer(1, "Antonio", 'm');
        Customer c2 = new Customer(2, "Carol", 'f');
        Customer c3 = new Customer(3, "Isabel", 'x'); //se asigna 'm' por genero inválido

        //Mostrar información de los clientes
        System.out.println(c1); // Antonio(1)
        System.out.println(c2); // Carol(2)
        System.out.println(c3); // Isabel(3)
        System.out.println("c1 Gender: " + c1.getGender()); // m
        System.out.println("c2 Gender: " + c2.getGender()); // f
        System.out.println("c3 Gender: " + c3.getGender()); // m

        System.out.println("\n--- Crear cuentas ---");
        //Crear cuentas
        Account acc1 = new Account(101, c1, 500.0); //cuenta con balance inicial
        Account acc2 = new Account(102, c2);                // cuenta con balance 0
        Account acc3 = new Account(103, c3, 300.0); // cuenta con balance inicial

        //Mostrar cuentas iniciales
        System.out.println(acc1); //Antonio balance=$500.0
        System.out.println(acc2); //Carol balance=$0.0
        System.out.println(acc3); //Isabel balance=$300.0

        System.out.println("\n--- Depósitos ---");
        //Depositar dinero
        acc1.deposit(150.0);
        acc2.deposit(200.0);
        acc3.deposit(50.0);

        //Mostrar cuentas después de depósitos
        System.out.println(acc1); //Antonio balance=$650.0
        System.out.println(acc2); //Carol balance=$200.0
        System.out.println(acc3); //Isabel balance=$350.0

        System.out.println("\n--- Retiros ---");
        //Retirar dinero
        acc1.withdraw(100.0); //balance=550
        acc2.withdraw(250.0); //mensaje de error
        acc3.withdraw(100.0); //balance = 250

        //Mostrar cuentas después de retiros
        System.out.println(acc1); //Antonio balance=$550.0
        System.out.println(acc2); //Carol balance=$200.0 (retiro fallido)
        System.out.println(acc3); //Isabel balance=$250.0
    }
}