package Association2;

public class UndergradStudent extends Student {
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void Branch(String b) {
		Branch b1=new Branch();
		System.out.println("Student studies in "+b1.Branch(b));
		
	}
	public void Society(String s) {
		Society s1 =new Society();
		
		System.out.println("Student has joined "+s1.collegeSociety(s)+" "+"society");
	}

}
