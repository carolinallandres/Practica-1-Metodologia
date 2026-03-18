package es.uah.matcomp.mp.e1.ejerciciosclases.practica_c.b;

public class TestPerson {

    public static void main(String[] args) {

        System.out.println("=== PROBANDO PERSON ===");
        Person p1 = new Person("Ana", "Calle Mayor 10");
        System.out.println(p1);
        p1.setAddress("Avenida del Sol 22");
        System.out.println("Nueva dirección: " + p1.getAddress());
        System.out.println();

        System.out.println("=== PROBANDO STUDENT ===");
        Student s1 = new Student("Luis", "Calle Luna 5", "Informática", 2, 1500.50);
        System.out.println(s1);
        s1.setProgram("Matemáticas");
        s1.setYear(3);
        s1.setFee(1800.75);
        System.out.println("Programa actualizado: " + s1.getProgram());
        System.out.println("Año actualizado: " + s1.getYear());
        System.out.println("Tasa actualizada: " + s1.getFee());
        System.out.println(s1);
        System.out.println();

        System.out.println("=== PROBANDO STAFF ===");
        Staff st1 = new Staff("Marta", "Calle Río 12", "IES Extremadura", 2000.0);
        System.out.println(st1);
        st1.setSchool("IES Navalmoral");
        st1.setPay(2200.0);
        System.out.println("Escuela actualizada: " + st1.getSchool());
        System.out.println("Pago actualizado: " + st1.getPay());
        System.out.println(st1);
    }
}
