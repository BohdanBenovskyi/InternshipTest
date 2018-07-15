package person;

import person.consciousness.Knowledge;

public class Student {
	private Knowledge knowledgeOfStudent;
	private String nameOfStudent;
	
	public Student(String name, int level) {
		this.nameOfStudent = name;
		this.knowledgeOfStudent = new Knowledge(level);
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledgeOfStudent = knowledge;
    }
    
    public int getKnowledgeLevel() {
    	return this.knowledgeOfStudent.getLevel();
    }
    
    public String getStudentName() {
    	return this.nameOfStudent;
    }
}