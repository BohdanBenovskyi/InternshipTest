package institution;

import java.util.ArrayList;
import java.util.List;

import person.Student;
import person.consciousness.Knowledge;

public class University {
	private String nameOfUniversity;				//variable which contains name of university
	private List<Student> listOfStudents;			//variable which contains list of all students
	private Knowledge averageUniversityKnowledge;	//variable which contains average level of knowledge
	private Student bestStudent;					//the best student in all University
	
	public University(String name) {
		this.nameOfUniversity = name;
		this.listOfStudents = new ArrayList<Student>();
		this.averageUniversityKnowledge = new Knowledge(0);	//zero for empty university
    }

    public void setStudent(Student student) {
        this.bestStudent = student;
    }

    public void addStudent(Student student) {
        listOfStudents.add(student);
        
        //calculation of average level
        if(listOfStudents.isEmpty()) {	//if this is our first student than set average level to level knowledge of student
        	averageUniversityKnowledge.setLevel(student.getKnowledgeLevel());
        }
        else {
        	int averageLevel = 0;		//variable for sum of all students knowledges
        	for(Student stnd : listOfStudents) {
        		averageLevel += stnd.getKnowledgeLevel();
        	}
        	averageUniversityKnowledge.setLevel((int)averageLevel/listOfStudents.size());	//calc average
        }
    }
    
    public Knowledge getAverageKnowledge() {
    	return this.averageUniversityKnowledge;
    }
    
    public List<Student> getListOfStudents() {
    	return this.listOfStudents;
    }
}