package institution.interlink;

import java.util.ArrayList;
import java.util.List;

import person.Student;
import person.consciousness.Knowledge;

public class Internship {
	private String nameOfInternShip;					//variable which contains name of internship
	private Knowledge averageKnowledge;					//variable which contains average level of knowledge
	private List<Student> listOfInternshipStudents;		//variable which contains list of internship students
	
	public Internship(String name, Knowledge averageKnowledge) {
        this.nameOfInternShip = name;
        this.averageKnowledge = averageKnowledge;
        this.listOfInternshipStudents = new ArrayList<Student>();
    }

    public void setStudent(Student student) {			//set Student to internship
        if(student.getKnowledgeLevel() > this.averageKnowledge.getLevel()) {	//check if student knowledge bigger than average knowledge of university
        	this.listOfInternshipStudents.add(student);							//if bigger than average value then add him to list of internship
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