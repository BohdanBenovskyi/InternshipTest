package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
	University university = new University("CH.U.I.");

	university.getStudentsFromSomeSource("DEMONSTRATION"); // or FILE or DATABASE or SERVICE
	university.setAverageKnowledge(university.getListOfStudents());

	Internship internship = new Internship("Interlink", university.getAverageKnowledge());

	for (Student stnd : university.getListOfStudents()) {
	    internship.setStudent(stnd);
	}

	System.out.println("List of internship's students:");
	System.out.println(internship.getStudents());
    }
}