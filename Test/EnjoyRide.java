package com.Assesment;
import java.util.Scanner;


public class EnjoyRide {
	public void Calculate(int adults,int children,int ride,int hrs) {
		if(ride==1) {
			int ar =50*hrs*adults ;
			int ch =40*hrs*children;
			System.out.println("Ride selected : Alibaba");
			System.out.println("Total hours of ride "+hrs);
			System.out.println("Total adult ride fare: "+(ar)+"$");
			System.out.println("Total child ride fare: "+(ch)+"$");
			System.out.println("Total Fare "+ (ar+ch));
		}
		else if(ride==2) {
			int ar =60*hrs*adults ;
			int ch =30*hrs*children;
			System.out.println("Ride selected : Alpine Slide");
			System.out.println("Total hours of ride "+hrs);
			System.out.println("Total adult ride fare: "+(ar)+"$");
			System.out.println("Total child ride fare: "+(ch)+"$");
			System.out.println("Total Fare "+ (ar+ch));
		}
		else if(ride==3) {
			
				int ar =45*hrs*adults ;
				int ch =25*hrs*children;
				System.out.println("Ride selected : Bumpper Cars");
				System.out.println("Total hours of ride "+hrs);
				System.out.println("Total adult ride fare: "+(ar)+"$");
				System.out.println("Total child ride fare: "+(ch)+"$");
				System.out.println("Total Fare "+ (ar+ch));
			
		}
		else if(ride==4) {
			int ar =70*hrs*adults ;
			int ch =60*hrs*children;
			System.out.println("Ride selected : BaloonRace");
			System.out.println("Total hours of ride:  "+hrs);
			System.out.println("Total adult ride fare: "+(ar)+"$");
			System.out.println("Total child ride fare: "+(ch)+"$");
			System.out.println("Total Fare: "+ (ar+ch));
		}
	}
        
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter how many adults");
		int n =sc.nextInt();
		System.out.println("Enter how many children");
		int n1 =sc.nextInt();
		System.out.println("Select RideName");
		System.out.println("1.Alibaba"+" "+"2.Alpine Slide"+" "+"3.Bumpper Cars"+" "+"4.Baloon Race");
		int n3 =sc.nextInt();
		System.out.println("How many hours of ride you want to take");
		int n4 =sc.nextInt();
		
		EnjoyRide r =new EnjoyRide();
		
		r.Calculate(n,n1,n3,n4);
			
		
			
		
	}
	
}
