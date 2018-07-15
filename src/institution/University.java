package institution;

import java.util.ArrayList;
import java.util.List;

import person.Student;
import person.consciousness.Knowledge;

public class University {
	private String nameOfUniversity;
	private List<Student> listOfStudents;
	
	public University(String name) {
		nameOfUniversity = name;
		listOfStudents = new ArrayList<Student>();
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
    }

    public void addStudent(Student student) {
        listOfStudents.add(student);
    }
}