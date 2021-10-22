import java.util.Scanner;
public class Switch {
	static Scanner sc =new Scanner(System.in);
	public static void Add() {
		
		System.out.println("enter two no's");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int d =a+b;
		System.out.println(d);
	}
	public static void Avg() {
		
		System.out.println("enter two no's");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int d =(a+b)/2;
		System.out.println(d);
	}
	public static void Eve() {
		
		System.out.println("enter the no");
		int a= sc.nextInt();
		if(a%2==0) {
			System.out.println("Even no");
		}
		else
			System.out.println("odd");
		
		
	}
	public static void Pos() {
		
		System.out.println("enter the no");
		int a= sc.nextInt();
		if(a>0) {
			System.out.println("positive");
		}
		else
			System.out.println("negative");
	}
public static void Prime() {
		
		System.out.println("enter the no");
		int a= sc.nextInt();
		int flag=1;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				flag=0;
				break;
				
			}
			
			
		}
		if(flag==1) {
			System.out.println("Prime");
		}
		else
			System.out.println("Not prime");
		
			
	}
	
	
	
	public static void main(String[] args) {
		do
		{
		Scanner pc =new Scanner(System.in);
		System.out.println("What case you want to implement");
		int a =pc.nextInt();
		switch(a) {
		case 1:Add();
		    break;
		case 2:Avg();
		      break;
		case 3:Eve();
		      break;
		case 4:Pos();
		       break;
		case 5: Prime();
		      break;
		case 6: System.exit(0);      
		}
		

} while(true) ;
	}
}

