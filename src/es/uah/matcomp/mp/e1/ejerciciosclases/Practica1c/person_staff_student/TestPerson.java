package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1c.person_staff_student;

public class TestPerson {

    public static void main(String[] args) {

        System.out.println("Probador de la clase person");

        Person p1 = new Person("Carolina", "Calle Río"); //se declara una persona
        System.out.println(p1);

        p1.setAddress("Calle Río, número 2");  // se modifica la dirección para ver si se actualiza
        System.out.println("Nueva dirección: " + p1.getAddress());
        System.out.println();


        System.out.println("Probador de la clase student");

        Student s1 = new Student("Álvaro", "Calle Mayor", "Matemáticas", 1, 1000); //se declara un estudiante
        System.out.println(s1);

        s1.setProgram("Informática"); //se modifica el programa, el año y la tarifa para ver si se actualizan
        s1.setYear(3);
        s1.setFee(880);

        System.out.println("Programa actualizado: " + s1.getProgram());
        System.out.println("Año actualizado: " + s1.getYear());
        System.out.println("Tasa actualizada: " + s1.getFee());
        System.out.println(s1);


        System.out.println("Probador de la clase staff");

        Staff st1 = new Staff("Isabel", "Calle Principal", "IES Profesor", 2700.0); //se declara una persona del staff
        System.out.println(st1);

        st1.setSchool("CEIP La Paz"); //se modifica el colegio y el pago para ver si se actualiza
        st1.setPay(2200.0);

        System.out.println("Escuela actualizada: " + st1.getSchool());
        System.out.println("Pago actualizado: " + st1.getPay());
        System.out.println(st1);
    }
}