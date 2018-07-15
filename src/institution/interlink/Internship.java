package institution.interlink;

import java.util.ArrayList;
import java.util.List;

import person.Student;
import person.consciousness.Knowledge;

public class Internship {
	private String nameOfInternShip;					//variable which contains name of internship
	private Knowledge averageKnowledge;					//variable which contains average level of knowledge
	private List<Student> listOfInternshipStudents;		//variable which contains list of internship students
	
	public Internship(String name, List<Student> allStudents, Knowledge averageKnowledge) {
        this.nameOfInternShip = name;
        this.averageKnowledge = averageKnowledge;
        this.listOfInternshipStudents = new ArrayList<Student>();
    }

    public void setStudent(Student student) {			//set Student to internship
        if(student.getKnowledgeLevel() > this.averageKnowledge.getLevel()) {
        	this.listOfInternshipStudents.add(student);
        }
    }

    public String getStudents() {
    	String students = "";
    	for(Student stnd : this.listOfInternshipStudents) {
    		students += stnd.getStudentName() + "\n";
    	}
    	return students;
    }
}