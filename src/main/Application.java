package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
	public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 5));
        university.addStudent(new Student("Julia Veselkina", 4));
        university.addStudent(new Student("Maria Perechrest", 3));
        university.addStudent(new Student("Petro Nicaragua", 2));
        university.addStudent(new Student("Vasuluna Zimbabve", 1));
        university.addStudent(new Student("Alex Uganda", 5));
        university.addStudent(new Student("Ivan Malaizia", 4));
        university.addStudent(new Student("Gregory Canada", 4));

        Internship internship = new Internship("Interlink", university.getAverageKnowledge());
        for(Student stnd : university.getListOfStudents()) {
        	internship.setStudent(stnd);
        }
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}