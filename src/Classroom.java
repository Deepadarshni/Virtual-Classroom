import java.util.ArrayList;
import java.util.List;

class Classroom {

	// "Private" access modifier is used for maintaining the sensitive data
	
	private String name;
	private List<String> students;
	private List<String> assignments;
	

	// Constructor for Classroom Class
	
	public Classroom(String name) {
		this.name = name;
		this.students = new ArrayList<>();
		this.assignments = new ArrayList<>();
	}
	
	
    // Getters for private fields
	
	public String getName() {
		return name;
	}

	public List<String> getStudents() {
		return students;
	}
	
	public List<String> getAssignments() {
		return assignments;
	}

}