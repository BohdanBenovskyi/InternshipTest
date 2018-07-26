package institution;

import java.util.ArrayList;
import java.util.List;

import person.Student;
import person.consciousness.Knowledge;

public class University {
    private String nameOfUniversity; 		  // variable which contains name of university
    private List<Student> listOfStudents; 	  // variable which contains list of all students
    private Knowledge averageUniversityKnowledge; // variable which contains average level of knowledge
    private Student bestStudent; 		  // the best student in all University

    public University(String name) {
	this.nameOfUniversity = name;
	this.listOfStudents = new ArrayList<Student>();
	this.averageUniversityKnowledge = new Knowledge(0); // zero for empty university
    }

    public void getStudentsFromSomeSource(String src) {
	switch (src) {
	case "FILE":
	    /* Implementation of getStudents from file */
	    break;

	case "SERVICE":
	    /* Implementation of getStudents from some service */
	    break;

	case "DATABASE":
	    /* Implementation of getStudents from database */
	    break;

	case "DEMONSTRATION":
	    addStudent(new Student("Andrew Kostenko", 5));
	    addStudent(new Student("Julia Veselkina", 4));
	    addStudent(new Student("Maria Perechrest", 3));
	    addStudent(new Student("Petro Nicaragua", 2));
	    addStudent(new Student("Vasuluna Zimbabve", 1));
	    addStudent(new Student("Alex Uganda", 5));
	    addStudent(new Student("Ivan Malaizia", 4));
	    addStudent(new Student("Gregory Canada", 4));
	    break;
	}
    }

    public void setStudent(Student student) {
	this.bestStudent = student;
    }

    public void addStudent(Student student) {
	listOfStudents.add(student);
    }

    public Knowledge getAverageKnowledge() {
	return this.averageUniversityKnowledge;
    }

    public List<Student> getListOfStudents() {
	return this.listOfStudents;
    }

    public void setAverageKnowledge(List<Student> listOfStudents) {
	int averageLevel = 0; // variable for sum of all students knowledges
	for (Student stnd : listOfStudents) {
	    averageLevel += stnd.getKnowledgeLevel();
	}
	averageUniversityKnowledge.setLevel((int) averageLevel / listOfStudents.size());
    }
}