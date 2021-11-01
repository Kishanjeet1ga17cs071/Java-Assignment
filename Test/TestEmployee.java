package com.Assesment;
import java.util.Scanner;

public class TestEmployee {
	public static void Calculate(Employee e) {
		
		double s =(e.getBasicSalary()+e.getHra()+e.getSpecialAllowances()+e.getTransportAllowances()-2500 );
		System.out.println("EmployeeId: "+e.getEmployeeId()+" "+"EmployeeName: "+e.getEmployeeName());
		System.out.println("Net Salary Of Employee: "+s);
		
	}
            
	       public static void main(String[] args) {
	    	   Scanner sc =new Scanner(System.in);
	    	   Employee e1 =new Employee();
	    	  
	    	 
	    	   e1.setEmployeeId(001);
	    	   System.out.println("EmployeeName");
	    	   String s =sc.nextLine();
	    	   e1.setEmployeeName(s);
	    	   System.out.println("Enter Basic salary");
	    	   int n =sc.nextInt();
	    	   e1.setBasicSalary(n);
	    	   
	    	   if(e1.getBasicSalary()>10000&&e1.getBasicSalary()<20000) {
	    	   e1.setSpecialAllowances((int) (0.9*(e1.getBasicSalary())));
	    	   }
	    	   else if(e1.getBasicSalary()<=10000) {
	    		   e1.setSpecialAllowances((int) (0.8*(e1.getBasicSalary())));
	    	   }
	    	   else {
	    		   e1.setSpecialAllowances((int) (0.95*(e1.getBasicSalary())));
	    	   }
	    	   
	    	   if(e1.getBasicSalary()>10000&&e1.getBasicSalary()<20000) {
	    	   e1.setHra(0.25*(e1.getBasicSalary()));
	    	   }
	    	   else if(e1.getBasicSalary()<=10000) {
	    		   e1.setHra(0.20*(e1.getBasicSalary()));
	    	   }
	    	   else
	    	   {
	    		   e1.setHra(0.30*(e1.getBasicSalary()));
	    	   }
	    	   
	    	   
	    	   e1.setTransportAllowances(0.2*(e1.getBasicSalary()));
	    	   
	    	   Calculate(e1);
	       }
}
