package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import source.Source;
import source.implementations.DemonstrationSource;

public class Application {
    public static void main(String[] args) {
	University university = new University("CH.U.I.");

	Source listStudents = new DemonstrationSource();	//or DatabaseSource or FileSource...
	
	for(Student student : listStudents.getStudents()) {
	    university.addStudent(student);
	}

	Internship internship = new Internship("Interlink", university.getAverageKnowledge());

	for (Student stnd : university.getListOfStudents()) {
	    internship.setStudent(stnd);
	}

	System.out.println("List of internship's students:");
	System.out.println(internship.getStudents());
    }
}