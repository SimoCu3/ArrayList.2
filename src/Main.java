/*
CONSEGNA:
Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> schoolClass1 = new ArrayList<>();

        Student student1 = new Student("Simone",21);
        Student student2 = new Student("Mario",22);
        Student student3 = new Student("Giovanni",23);
        Student student4 = new Student("Stefano",20);
        Student student5 = new Student("Alessandro",19);
        Student student6 = new Student("Marco",24);
        Student student7 = new Student("Luca",21);
        Student student8 = new Student("Laura",22);
        Student student9 = new Student("Federica",23);
        Student student10 = new Student("Alessio",21);
        Student student11 = new Student("Denise",20);
        Student student12 = new Student("Aaron",24);

        schoolClass1.add(student1);
        schoolClass1.add(student2);
        schoolClass1.add(student3);
        schoolClass1.add(student4);
        schoolClass1.add(student5);
        schoolClass1.add(student6);
        schoolClass1.add(student8);
        schoolClass1.add(student9);
        schoolClass1.add(student10);
        schoolClass1.add(student11);
        schoolClass1.add(student12);

        //Metodo per comparare Lista di oggetti in ordine Alfabetico
        schoolClass1.sort(Comparator.comparing(Student::getName));

        System.out.println("Classe: \n" + schoolClass1);

    }
}

/*
CORREZIONE:

*/