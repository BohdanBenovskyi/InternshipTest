package source.implementations;

import java.util.ArrayList;

import person.Student;
import source.Source;

public class FileSource implements Source {
    private ArrayList<Student> lst;
    
    @Override
    public ArrayList<Student> getStudents() {
	lst = new ArrayList<Student>();
	return lst;
    }

}
