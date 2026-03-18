package Practica1c.Person;

public class TestPerson {
    public static void main(String[] args) {
        //Crear persona
        Person p1=new Person("Carol","Azuqueca");
        System.out.println(p1);

        //Crear estudiante
        Student s1=new Student("Moratilla","Alcalá","JDK",2,1200.0);
        System.out.println(s1);

        //Crear staff
        Staff st1=new Staff("Isabel","Loeches","Ingeniera",3500.0);
        System.out.println(st1);

        //Modificar algunos datos usando setters
        p1.setAddress("Madrid");
        s1.setYear(3);
        s1.setFee(1300.0);
        st1.setPay(3600.0);

        System.out.println("\nDespués de modificar:");
        System.out.println(p1);
        System.out.println(s1);
        System.out.println(st1);

        //Usando getters
        System.out.println("\nDatos individuales:");
        System.out.println(s1.getName()+" estudia "+s1.getProgram()+" y paga "+s1.getFee());
        System.out.println(st1.getName()+" trabaja en "+st1.getSchool()+" con sueldo "+st1.getPay());
    }
}