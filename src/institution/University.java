package institution;

import java.util.ArrayList;

import person.Student;

public class University {
	private String nameOfUniversity;
	private ArrayList<Student> lst;		//list of students
	
    public University(String name) {
    	nameOfUniversity = name;
    	lst = new ArrayList<Student>();
    }

    public void setStudent(Student student) {
        
    }

    public void addStudent(Student student) {
        lst.add(student);		//add student to list
    }
    
    public void printList() {
    	for(Student std : lst) {
    		System.out.println(std.getName());
    	}
    }
}