package source.implementations;

import java.util.ArrayList;

import person.Student;
import source.Source;

public class DemonstrationSource implements Source {
    private ArrayList<Student> listOfStudents;
    
    @Override
    public ArrayList<Student> getStudents() {
	listOfStudents = new ArrayList<Student>();
	
	listOfStudents.add(new Student("Andrew Kostenko", 5));
	listOfStudents.add(new Student("Julia Veselkina", 4));
	listOfStudents.add(new Student("Maria Perechrest", 3));
	listOfStudents.add(new Student("Petro Nicaragua", 2));
	listOfStudents.add(new Student("Vasuluna Zimbabve", 1));
	listOfStudents.add(new Student("Alex Uganda", 5));
	listOfStudents.add(new Student("Ivan Malaizia", 4));
	listOfStudents.add(new Student("Gregory Canada", 4));
	
	return listOfStudents;
    }

}
