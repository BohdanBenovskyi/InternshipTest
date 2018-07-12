package person;

import person.consciousness.Knowledge;

public class Student {
	private String nameOfStudent;
	private String lastnameOfStudent;
	private Knowledge knw;
	
    public Student(String name, String lastname, int knowLevel) {
    	nameOfStudent = name;
    	lastnameOfStudent = lastname;
    	knw = new Knowledge(knowLevel);
    }

    public void setKnowledge(Knowledge knowledge) {
        //TODO: Implementation is needed
    }
}