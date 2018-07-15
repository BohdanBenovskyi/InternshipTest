package person;

import person.consciousness.Knowledge;

public class Student {
	private Knowledge knowledgeOfStudent;
	private String nameOfStudent;
	
	public Student(String name, int level) {
		nameOfStudent = name;
		knowledgeOfStudent = new Knowledge(level);
    }

    public void setKnowledge(Knowledge knowledge) {
        knowledgeOfStudent = knowledge;
    }
    
    public int getKnowledgeLevel() {
    	return knowledgeOfStudent.getLevel();
    }
    
    public String getStudentName() {
    	return nameOfStudent;
    }
}