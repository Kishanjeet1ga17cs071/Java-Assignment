

import java.util.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class FlowerDemo {
	static Map<String,String> m1 =new HashMap<String,String>();
	 static Map<String,String> m2 =new HashMap<String,String>();
	 static  Map<String,String> m3 =new HashMap<String,String>();
	 
	private static void display(String p) {
		if(p.equals("Asia")||p.equals("ASIA")) {
		FlowerDemo f5 =new FlowerDemo();
		f5.List1();
		}
		else if(p.equals("Europe")||p.equals("EUROPE")) {
			FlowerDemo f3 =new FlowerDemo();
			f3.List2();
			}
		else if(p.equals("Africa")||p.equals("AFRICA")) {
			FlowerDemo f4 =new FlowerDemo();
		f4.List3();
		}
		}
			
		
		
	private void List3() {
		Set j =m3.entrySet();
		for(Object p:j) {
			System.out.println(p);
		}
		
	}



	private void List2() {
		Set j =m2.entrySet();
		for(Object p:j) {
			System.out.println(p);
		}
		
	}

	
	  
	
	  
	   
	  
	
	private void List1() {
		
		Set j =m1.entrySet();
		for(Object p:j) {
			System.out.println(p);
		}
	}






	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	System.out.println("Enter the name of Continent");
	   String p =sc.nextLine();
	 
	   
	   m1.put("India", "Flower");
	   m1.put("Pakistan","Jasmine");
	   m1.put("Nepal", "Lali Guran");
	   
	 
	 
	  
	   m2.put(" Germany", "Corn Flower ");
	   m2.put("France ", " Lily");
	   m2.put("Greece ", "Acanthus Mollis ");
	   
	  
	   
	  
	 
	   
	   m3.put(" Egypt", "Blue Lotus");
	   m3.put("Nigeria ", " Yellow Trumpet");
	   m3.put("Kenya ", "Orchid ");
	 
	   
	   FlowerDemo f =new FlowerDemo();
	  
	   display(p);
	   
	  
	}


	

}
