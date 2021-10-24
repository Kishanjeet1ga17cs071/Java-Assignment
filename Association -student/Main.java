package Association2;

public class Main {
	public static void main(String[] args) {
	UndergradStudent u = new UndergradStudent();
	u.setName("Student1");
	u.setRollNo(71);
	u.setCity("Toronto");
	System.out.println(" ");
	System.out.println("Student Details");
	System.out.println("******************** ");
	System.out.println("Student name: "+u.getName());
	
	System.out.println("student rollNo: "+u.getRollNo());
	
	System.out.println("Student city: "+u.getCity());
	u.Branch("CSE");
	u.Society("Drama Club");
	System.out.println(" ");
	
	
	
	UndergradStudent u2 = new UndergradStudent();
	u2.setName("Student2");
	u2.setRollNo(72);
	u2.setCity("London");
	System.out.println(" ");
	System.out.println("Student Details");
	System.out.println("******************** ");
	System.out.println("Student name: "+u2.getName());
	
	System.out.println("student rollNo: "+u2.getRollNo());
	
	System.out.println("Student city: "+u2.getCity());
	u2.Branch("EEE");
	u2.Society("Cultural Club");
	
	
	
	
	}

}
